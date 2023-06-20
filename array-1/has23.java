public boolean has23(int[] nums) {
  for (int value : nums) {
    if(value == 2 || value == 3){
      return true;
    }
  }
  return false;
}
