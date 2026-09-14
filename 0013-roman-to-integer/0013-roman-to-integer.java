class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] charArr = s.toCharArray();
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
            int currentElement = map.get(charArr[i]);
            int nextElement = 0;
            if(i<charArr.length-1){
                nextElement = map.get(charArr[i + 1]);
            }
            if (currentElement < nextElement) {
                currentElement = currentElement * -1;
                result += currentElement;
            } else {
                result += currentElement;
            }
        }
        return result;
    }
}