class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] composite = new boolean[n];
        //Array of composites -> true represents composite and false are prime numbers
        for (int i = 2; i * i < n; i++) {
            //mark all mutiples of i as true
            if (composite[i] == false)
                //the first index to be flipped to true is i*i 
                for (int j = i * i; j < n; j += i)
                    composite[j] = true;
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (composite[i] == false)
                count++;
        }
        return count;
    }
}