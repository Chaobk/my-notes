/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        return search(nums, target, 0, nums.length - 1);
    }

    public boolean search(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            }
           
            if (nums[left] > nums[mid]) {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[left] < nums[mid]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[left] == nums[mid]) {
                // 此时不确定起点是否在mid左侧
                return search(nums, target, left, mid - 1) || search(nums, target, mid + 1, right);
            }
        }    
        
        return false;

    }
}
// @lc code=end

