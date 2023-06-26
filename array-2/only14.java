public boolean only14(int[] nums) {
  boolean match = Arrays.stream(nums).allMatch(n -> n == 1 || n == 4);
  if(match){
    return true;
  } else {
    return false;
  }
}