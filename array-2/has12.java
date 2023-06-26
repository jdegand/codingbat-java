public boolean has12(int[] nums) {
  boolean index1 = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1){
      index1 = true;
    }
    if(index1 && nums[i] == 2){
        return true;
      } 
    }
  return false;
}
