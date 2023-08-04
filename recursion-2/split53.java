public boolean split53(int[] nums) {
  return divide(0, nums, 0, 0);
}

public boolean divide(int index, int[] nums, int sum1, int sum2){
    if(index >= nums.length){
      return sum1 == sum2;
    }
  
    if(nums[index] % 5 == 0){
      return divide(index + 1, nums, sum1 + nums[index], sum2);
    }  
    if(nums[index] % 3 == 0 && nums[index] % 5 != 0){
      return divide(index + 1, nums, sum1, sum2 + nums[index]);
    }
    
    // reuse splitArray solution
    
    if(divide(index + 1, nums, sum1 + nums[index], sum2)) {
      return true;
    }
  
    return divide(index+1, nums, sum1, sum2 + nums[index]);
}
