package com.algorithms;
import java.util.Arrays;
public class GenerateBinaryTree {
  private TreeNode root;
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    int len = inorder.length;
    TreeNode root2 =  buildBT(root, inorder, postorder, len);
    return root;
  }

  private TreeNode buildBT(TreeNode root, int[] in, int[] post,int length) {
    if(in.length == 0 || post.length == 0) return null;
    if(in.length == 1) {
      return root = new TreeNode(in[0]);
    }else{
      int lastElement = post[length - 1];
      int index = findElementIndex(in, lastElement);
      System.out.println("index" + index);
      if(index > -1) {
        root = new TreeNode(in[index]);
        int[] leftSideArray = Arrays.copyOfRange(in, 0, index);
        int[] rightSideArray = Arrays.copyOfRange(in, index + 1, in.length);
        root.left = buildBT(root.left, leftSideArray, post, length - 1);
        root.right = buildBT(root.right, rightSideArray, post, length - 1);
        return root;
      }else {
        buildBT(root, in , post, length - 1);
        buildBT(root, in , post, length - 1);
      }
    }
    return root;
  }

  private int findElementIndex(int[] arr, int element) {
    for(int i = 0; i < arr.length; i++ ) {
      if(arr[i] == element) return i;
    }
    return -1;
  }
}
