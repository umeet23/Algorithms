package com.algorithms.recursions;

import com.algorithms.ListNode;

public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode newHead = head.next;
    ListNode tempNode = newHead.next;
    newHead.next = head;
    head.next = swapPairs(tempNode);
    return newHead;
  }
}
