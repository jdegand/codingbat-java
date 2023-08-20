public int[] fix34(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 3) {
      int temp = nums[i+1];
      nums[i+1] = 4;
      
      // all other numbers are the same
      // so all you have to look for is 3 && 4
      
      for(int j = i + 2; j < nums.length; j++) {
        if(nums[j] == 4) {
          nums[j] = temp;
        } 
      }
    }
    
  }
  return nums;
}
