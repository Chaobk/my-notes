/*
 * @lc app=leetcode.cn id=89 lang=java
 *
 * [89] 格雷编码
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.add(head + list.get(size));
            }
            head <<= 1;
        }

        return list;
    }
}
// @lc code=end

