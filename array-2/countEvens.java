public int countEvens(int[] nums) {
  int count = 0;
  for(int item : nums){
    if(item % 2 == 0){
      count += 1;
    }
  }
  return count;
}
