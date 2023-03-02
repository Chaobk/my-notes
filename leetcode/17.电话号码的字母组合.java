/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {

    int[] strLen = {0, 0, 3, 3, 3, 3, 3, 4, 3, 4};

    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if (digits.length() == 0) {
            return list;
        }

        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        dfs(str, digits, sb, list);

        return list;
    }

    private void dfs(String[] str, String digits, StringBuilder cur, List<String> list) {
        if (cur.length() == digits.length()) {
            list.add(cur.toString());
            return;
        }

        int loc = digits.charAt(cur.length()) - '0';
        for (int i = 0; i < strLen[loc]; i++) {
            cur.append(str[loc].charAt(i));
            dfs(str, digits, cur, list);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
// @lc code=end

