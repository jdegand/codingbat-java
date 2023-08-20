public int maxSpan(int[] nums) {
  int max = 0;

  for(int i = 0; i < nums.length; i++) {
    for(int j = 0; j < nums.length; j++) {
      if(nums[i] == nums[j]) {
        int temp = i - j + 1;
        if(temp > max){
          max = temp;
        }
      }
    }
  }
  return max;
}
