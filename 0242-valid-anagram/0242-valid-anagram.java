class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Long> sCount = s.chars().mapToObj( c ->(char) c ).collect(Collectors.groupingBy(Function.identity() , Collectors.counting() ));
        Map<Character, Long> tCount = t.chars().mapToObj( c ->(char) c ).collect(Collectors.groupingBy(Function.identity() , Collectors.counting() ));

        return sCount.equals(tCount);
    }
}