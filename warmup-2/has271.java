public boolean has271(int[] nums) {
  
  for(int i = 0; i < nums.length - 2; i++){
    //need to wrap nums[i]-1 in parentheses otherwise won't work
    if(nums[i] + 5 == nums[i+1] && Math.abs(nums[i+2] - (nums[i]-1)) <= 2) {
      return true;
    }
  }
  
  return false;
}
