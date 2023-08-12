package com.algorithms;

public class SerializeDeserializeTree {

  private final String nullSymbol = "@";

  public String serializeTree(TreeNode root) {
    if(root == null) return nullSymbol;
    String left = serializeTree(root.left);
    String right = serializeTree(root.right);
    return root.val + "," + left + "," + right;
  }
  String[] tempArray;
  public TreeNode deserializeTree(String data) {
    tempArray = data.split(",");
    return dfs();
  }

  int index = 0;
  private TreeNode dfs() {
    if(tempArray[index].equals(nullSymbol)) {
      index++;
      return null;
    }
    TreeNode node = new TreeNode(Integer.parseInt(tempArray[index++]));
    node.left = dfs();
    node.right = dfs();
    return node;
  }
}
