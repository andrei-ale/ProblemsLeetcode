package Pb_876_MiddleOfLinkedList;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    public:
    ListNode* middleNode(ListNode* head) {
        ListNode *it, *it2;
        it = it2 = head;
        while (it2 != nullptr && it2->next != nullptr)
        {
            it2 = it2->next->next;
            it = it->next;
        }

        return it;
    }
};
