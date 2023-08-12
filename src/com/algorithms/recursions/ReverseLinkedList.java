package com.algorithms.recursions;

import com.algorithms.ListNode;

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode tail = head.next;
    ListNode newHead = reverseList(tail);
    head.next = null;
    tail.next = head;
    return newHead;
  }
}
