/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < m; i++) {
            arr[1] = 1;
            for (int j = 2; j <= n; j++) {
                arr[j] += arr[j - 1];
            }
        }
        return arr[n];

    }
}
// @lc code=end

