package Pb_206_ReverseLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ArrayList <ListNode> nodeList = new ArrayList<>();
        while (head != null) {
            nodeList.add(head);
            head = head.next;
        }
        for (ListNode i : nodeList) {
            System.out.println(i.val);
        }
        for (int i = nodeList.size() - 1; i > 0; i--){
            nodeList.get(i).next = nodeList.get(i-1);
        }
        nodeList.get(0).next = null;

        return nodeList.get(nodeList.size() - 1);
    }
}
