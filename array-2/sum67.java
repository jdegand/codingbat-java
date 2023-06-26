public int sum67(int[] nums) {
    int total = 0;
    boolean six = false;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 6){
        six = true;
      } 
    
      if(!six){
        total += nums[i];
      }
      
      if(nums[i] == 7){
        six = false;
      }
      
    }
    return total;
  }
  