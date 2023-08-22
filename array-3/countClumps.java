public int countClumps(int[] nums) {
  int clumps = 0;
  int number;
  
  for(int i = 0; i < nums.length-1; i++){
    
    if(nums[i+1] == nums[i]){
      number = nums[i];
      clumps++;
         
      while(i < nums.length && nums[i] == number){
        i++;
      }
      i--;
    }
  }
  return clumps;
}
