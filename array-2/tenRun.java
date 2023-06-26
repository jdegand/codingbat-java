public int[] tenRun(int[] nums) {
  boolean ten = false;
  int multiple = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0){
      ten = true;
      multiple = nums[i];
    }
    if(ten){
      nums[i] = multiple;
    } 
  }
  return nums;
}
