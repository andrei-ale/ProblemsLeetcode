package Pb_19_RemoveNthNodeFromEndOfList;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int numNodes = 0;
        ListNode temp = head;
        ListNode first = head;
        ListNode initialHead = head;
        while (head != null) {
            numNodes++;
            head = head.next;
            System.out.println("Numarul de noduri este: " + numNodes);
        }
        if (n == numNodes){
            return initialHead.next;
        }

        for (int i = 0; i < numNodes - n - 1; i++){
            temp = temp.next;
        }

        ListNode del = temp.next;

        temp.next = temp.next.next;
        del.next = null;
        for (int i = 0; i < numNodes - 1; i++)
        {
            System.out.println(first.val);
            first = first.next;
        }
        return initialHead;
    }
}
