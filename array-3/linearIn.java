public boolean linearIn(int[] outer, int[] inner) {
  for(int i = 0; i < inner.length; i++){
    if(!contains(outer, inner[i])){
      return false;
    }
  }
  return true;
}

boolean contains(int[] nums, int num) {
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == num){
      return true;
    }
  }
  return false;
}
