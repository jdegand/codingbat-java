public int[] copyEndy(int[] nums, int count) {
  int[] arr = new int[count];
  
  int index = 0;
  
  for(int i = 0; i < nums.length; i++) {
    
    if(index == count) {
      break;
    }

    if(isEndy(nums[i])) {
      arr[index] = nums[i];
      index++;
    }
  }
  return arr;
}

boolean isEndy(int n) {
  if((n >= 0  && n <= 10) || (n >= 90 && n <= 100)) {
    return true;
  }
  return false;
}
