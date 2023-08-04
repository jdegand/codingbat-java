public boolean splitOdd10(int[] nums) {
  return divide(0, nums, 0, 0);
}

public boolean divide(int index, int[] nums, int sum1, int sum2){
  if(index >= nums.length){
    if(sum1 % 10 == 0 && sum2 % 2 != 0){
      return true;
    }
    return false;
  }
  
  if(divide(index + 1, nums, sum1 + nums[index], sum2)) {
    return true;
  }
  
  return divide(index+1, nums, sum1, sum2 + nums[index]);
}
