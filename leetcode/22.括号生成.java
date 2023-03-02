/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sbu = new StringBuilder();
        generate(res, sbu, 0, 0, n);
        return res;
    }

    private void generate(List<String> res, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            res.add(cur.toString());
            return;
        }

        cur.append("(");
        if (open < max) {
            generate(res, cur, open + 1, close, max);
        }
        cur.deleteCharAt(cur.length() - 1);

        cur.append(")");
        if (close < open) {
            generate(res, cur, open, close + 1, max);
        }
        cur.deleteCharAt(cur.length() - 1);
    }
}
// @lc code=end

