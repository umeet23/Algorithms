package com.algorithms.recursions;

import com.algorithms.ListNode;

public class MergeSortedList {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null ) return list1;

    ListNode merge = new ListNode();
    ListNode tRoot = merge;
    while (list1 != null && list2 != null) {
      if(list1.val < list2.val) {
        tRoot.next = list1;
        list1 = list1.next;
      }else {
        tRoot.next = list2;
        list2 = list2.next;
      }
      tRoot = tRoot.next;
    }
    if (list1 == null) {
      tRoot.next = list2;
    }
    if (list2 == null) {
      tRoot.next = list1;
    }
    return merge.next;
  }
}
