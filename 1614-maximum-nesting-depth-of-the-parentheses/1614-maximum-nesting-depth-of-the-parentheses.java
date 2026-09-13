
class Solution {
    public int maxDepth(String s) {
        char[] carr = s.toCharArray();
        int max_parantheses = 0;
        int depth = 0;
        for (int i = 0; i < carr.length; i++) {
            if (carr[i] == '(') {
                depth++;
                if(depth>max_parantheses)
                    max_parantheses++;
            }
            if (carr[i] == ')')
                depth--;
        }
        return max_parantheses;
    }
}