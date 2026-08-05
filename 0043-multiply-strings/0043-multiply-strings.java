class Solution {
    public String multiply(String s1, String s2) {
        StringBuilder product = new StringBuilder();
        boolean s1Negative = s1.charAt(0) == '-';
        boolean s2Negative = s2.charAt(0) == '-';
        if (s1Negative)
            s1 = s1.substring(1);
        if (s2Negative)
            s2 = s2.substring(1);
        // Strip leading zeros
        s1 = s1.replaceFirst("^0+(?!$)", "");
        s2 = s2.replaceFirst("^0+(?!$)", "");

        if (s1.equals("0") || s2.equals("0"))
            return "0";
        int[] result = new int[s1.length() + s2.length()];

        //multiply digits in reverse order(rightmost digits first)
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                //multiply digits
                int digit1 = s1.charAt(i) - '0';
                int digit2 = s2.charAt(j) - '0';
                int mul = digit1 * digit2;

                //find position in result array
                int posHigh = i + j;
                int posLow = i + j + 1;

                //add multiplication result to position
                int sum = mul + result[posLow];
                result[posLow] = sum % 10; //set the current position to the remainder
                result[posHigh] += sum / 10; //add the carry to the next position
            }
        }
        boolean leadingZero = true;
        for (int i : result) {
            if (leadingZero && i == 0)
                continue;
            leadingZero = false;
            product.append(i);
        }
        String resultStr = product.toString();
        if (s1Negative ^ s2Negative)
            resultStr = "-" + resultStr;
        return resultStr;
    }
}