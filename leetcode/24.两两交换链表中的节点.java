/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode x = dummy;
        ListNode y = x.next;

        while (y != null && y.next != null) {
            x.next = y.next;
            y.next = x.next.next;
            x.next.next = y;

            x = x.next.next;
            if (x == null || x.next == null) break;
            y = x.next;
        }

        return dummy.next;
    }
}
// @lc code=end

