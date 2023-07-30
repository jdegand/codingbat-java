public int arrayCount9(int[] nums) {
  int count = 0;
  
  for(int num : nums){
    if(num == 9){
      count += 1;
    }
  }
  return count;
}
