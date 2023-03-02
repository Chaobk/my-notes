/*
 * @lc app=leetcode.cn id=676 lang=java
 *
 * [676] 实现一个魔法字典
 */

// @lc code=start
class MagicDictionary {
    ArrayList<String>[] lists = new ArrayList[101];
    public MagicDictionary() {
        for (int i = 0; i < 101; i++) {
            lists[i] = new ArrayList<>();
        }
    }
    
    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            int len = word.length();
            lists[len].add(word);
        }
    }
    
    public boolean search(String searchWord) {
        int len = searchWord.length();
        for (String word : lists[len]) {
            if (isSimilar(word, searchWord)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSimilar(String str1, String str2) {
        int diff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return diff == 1;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
// @lc code=end

