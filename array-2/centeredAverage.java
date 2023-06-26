public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  int total = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] > max){
      max = nums[i];
    }
    if(nums[i] < min){
      min = nums[i];
    }
     total += nums[i];
  }
  
  return (total - max - min) / (nums.length - 2);
}
