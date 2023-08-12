package com.algorithms;

public class TreeNode {
    int val;
    com.algorithms.TreeNode left;
    com.algorithms.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, com.algorithms.TreeNode left, com.algorithms.TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
