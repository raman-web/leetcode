class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for (String s : strs) {
            for (int i = 0; i < strs[0].length(); i++) {
                if (s.startsWith(word)) {
                    break;
                    }else{
                    word = word.substring(0, word.length()-1);
                }
            }
        }
        return word;
    }
}