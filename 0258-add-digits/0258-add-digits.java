class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return num;
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            sum += digit;
        }
        while(sum>9){
            sum = addDigits(sum);
        }
        return sum;
    }
}