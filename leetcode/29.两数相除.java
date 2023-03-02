/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        }
        boolean flag = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long res = 0;

        while (a >= b) {
            long c = b;
            int count = 1;
            while (a >= (c << 1)) {
                c <<= 1;
                count <<= 1;
            }
            a -= c;
            res += count;
        }

        return flag ? (int) res : (int) -res;
    }
}
// @lc code=end

