class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> charCountS = new HashMap<>();
        Map<Character, Integer> charCountT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);

            if (!charCountS.containsKey(chs)) {
                charCountS.put(chs, 1);
            } else {
                charCountS.put(chs, charCountS.get(chs) + 1);
            }

            char cht = t.charAt(i);
            if (!charCountT.containsKey(cht)) {
                charCountT.put(cht, 1);
            } else {
                charCountT.put(cht, charCountT.get(cht) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            if (!(charCountS.get(chs)).equals(charCountT.get(chs))) {
                return false;
            }
        }
        return true;
    }
}