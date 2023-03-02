/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        list.add(temp);

        for (int num : nums) {
            for (int i = list.size() - 1; i >= 0; i--) {
                List<Integer> newList = new ArrayList<>(list.get(i));
                newList.add(num);
                list.add(newList);
            }
        }

        return list;
    }
}
// @lc code=end

