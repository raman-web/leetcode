class Solution {
    public boolean containsDuplicate(int[] nums) {
      List<Integer> numbers = new ArrayList<>(nums.length);
      for( int n : nums ) numbers.add(n);
      long count = numbers.stream().distinct().count();
      return count < numbers.size();
    }
}