public int[] zeroFront(int[] nums) {
  int[] arr = new int[nums.length];
  int index = nums.length-1;
  for(int i = 0; i < nums.length; i++){
      
    if(nums[i] != 0){
      arr[index] = nums[i];
      index--;
    }
      
  }
  return arr;
}
  
