/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            } else {
                if (i == 0 || i > 0 && nums[i - 1] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }
}
// @lc code=end

