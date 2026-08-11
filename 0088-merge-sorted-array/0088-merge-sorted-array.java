class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pnum1=m-1,pnum2=n-1,write=m+n-1;
        while(pnum2>=0 ) {
            if(pnum1>=0 && nums1[pnum1]>nums2[pnum2]) {
                nums1[write]=nums1[pnum1];
                pnum1--;
            }
            else {
                nums1[write]=nums2[pnum2];
                pnum2--;
                }
                write--;
        }
    }
}