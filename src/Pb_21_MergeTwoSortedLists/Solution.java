package Pb_21_MergeTwoSortedLists;

import java.util.LinkedList;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode resultEnd = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val){
                resultEnd.next = list1;
                resultEnd = resultEnd.next;
                list1 = list1.next;
            }
            else{
                resultEnd.next = list2;
                resultEnd = resultEnd.next;
                list2 = list2.next;

            }
        }
        while (list1 != null){
            resultEnd.next = list1;
            resultEnd = resultEnd.next;
            list1 = list1.next;
        }
        while (list2 != null){
            resultEnd.next = list2;
            resultEnd = resultEnd.next;
            list2 = list2.next;
        }
        return result.next;
    }
}
