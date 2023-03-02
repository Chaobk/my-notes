/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        int i = 0;
        while (i < left - 1) {
            prev = prev.next;
            i++;
        }
        ListNode cur = prev.next;
        ListNode next = cur.next;
        while (i < right - 1) {
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = cur.next;
            i++;
        }
        return dummy.next;
    }
}
// @lc code=end

