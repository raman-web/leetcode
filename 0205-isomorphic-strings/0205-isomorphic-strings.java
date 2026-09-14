class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        char[] result = new char[s.length()];
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();

        for (int i = 0; i < charArr1.length; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1) ){
                if(map.containsValue(c2)) 
                    return false;
                map.put(c1,c2);
            } else if ( map.get(c1) != c2 ) {
                return false;
            }
            result[i] = map.get(c1);
        }
        if(new String(result).equals(t)) return true;
        else return false;
    }
}