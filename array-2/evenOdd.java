public int[] evenOdd(int[] nums) {
  int[] arr = new int[nums.length];
  int evenIndex = 0;
  int oddIndex = nums.length-1;
    
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0){
      arr[evenIndex] = nums[i];
      evenIndex++;
    } else {
      arr[oddIndex] = nums[i];
      oddIndex--;
    }
  }
    
  return arr;
}
   