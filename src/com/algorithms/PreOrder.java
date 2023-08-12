package com.algorithms;
import java.util.HashMap;

public class PreOrder {
  int preIndex = 0;
  HashMap<Integer, Integer> inMap = new HashMap<>();
  public TreeNode buildTree(int[] inorder, int[] preorder) {
    if (inorder == null || preorder == null || inorder.length != preorder.length)
      return null;

    for (int i = 0; i < inorder.length; i++) {
      inMap.put(inorder[i], i);
    }
    TreeNode root = build(preorder, 0, preorder.length - 1);

    return root;
  }
  public TreeNode build(int[] preorder, int inStart, int inEnd) {

    if (inStart > inEnd){
      return null;
    }
    int rootValue = preorder[preIndex++];
    TreeNode tNode = new TreeNode(rootValue);

    int inRoot = inMap.get(rootValue);
    tNode.left = build(preorder, inStart, inRoot - 1);
    tNode.right = build(preorder, inRoot + 1, inEnd);

    return tNode;
  }
  private TreeNode arrayToTree(int[] preorder, int left, int right) {
    // if there are no elements to construct the tree
    if (left > right) return null;

    // select the preorder_index element as the root and increment it
    int rootValue = preorder[preIndex++];
    TreeNode root = new TreeNode(rootValue);

    // build left and right subtree
    // excluding inorderIndexMap[rootValue] element because it's the root
    root.left = arrayToTree(preorder, left, inMap.get(rootValue) - 1);
    root.right = arrayToTree(preorder, inMap.get(rootValue) + 1, right);
    return root;
  }
}
