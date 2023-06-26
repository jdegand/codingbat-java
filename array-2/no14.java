public boolean no14(int[] nums) {
    boolean match = Arrays.stream(nums).anyMatch(n -> n == 1 );
    boolean match2 = Arrays.stream(nums).anyMatch(n -> n == 4);
    if(match && match2){
      return false;
    }
  return true;
}
