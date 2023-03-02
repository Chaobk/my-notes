/*
 * @lc app=leetcode.cn id=2148 lang=java
 *
 * [2148] 元素计数
 */

// @lc code=start
class Solution {
    public int countElements(int[] nums) {
       int min = 100001;
       int max = -min;

       for (int num : nums) {
           min = Math.min(min, num);
           max = Math.max(max, num);
       }

       int res = 0;
       for (int num : nums) {
           res += (num > min && num < max ? 1 : 0);
       }

       return res;
    }
}
// @lc code=end

