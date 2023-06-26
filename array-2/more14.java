public boolean more14(int[] nums) {
  int sumOnes = 0;
  int sumFours = 0;
  for(int num : nums){
    if(num == 1){
      sumOnes += 1;
    } else if(num == 4){
      sumFours += 1;
    }
  }
  if(sumOnes > sumFours){
    return true;
  } else {
    return false;
  }
}