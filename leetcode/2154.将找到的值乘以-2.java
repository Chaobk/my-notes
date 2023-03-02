/*
 * @lc app=leetcode.cn id=2154 lang=java
 *
 * [2154] 将找到的值乘以 2
 */

// @lc code=start
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int[] arr = new int[1005];
        for (int num : nums) {
            arr[num] = 1;
        }

        while (original <= 1000 && arr[original] != 0) {
            original *= 2;
        }

        return original;
    }
}
// @lc code=end

