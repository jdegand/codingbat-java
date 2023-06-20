public boolean no23(int[] nums) {
  for (int value : nums) {
    if(value == 2 || value == 3){
      return false;
    }
  }
  return true;
}