public int maxMirror(int[] nums) {
    int max = 0;
    for(int i = 0; i < nums.length; i++) {
      int count = 0;
      for(int j = nums.length-1; j >= 0; j--) {
        if(i + count < nums.length && nums[i+count] == nums[j]) {
          count++;
        }
        else {
          max = Math.max(max, count);
          count = 0;
        }
      }
      
      max = Math.max(max, count);
    }
    return max;
  }
  