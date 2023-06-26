public boolean haveThree(int[] nums) {
  int count = 0;
    
  if(nums.length > 1 && nums[0] == 3){ // without nums.length > 1 -> error
    count += 1;
  }
    
  for(int i = 1; i < nums.length; i++){
    if(nums[i-1] == 3 && nums[i] == 3){
      return false;
    }
    if(nums[i] == 3){
      count += 1;
    }
  }
  return count == 3;
}
  