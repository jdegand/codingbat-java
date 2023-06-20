public int sum2(int[] nums) {  
  if(nums.length >= 2){
    int[] newArr = new int[2];   
       
    for (int i = 0; i < 2; i++){   
      newArr[i] = nums[i];   
    }  
       
    int sum = 0;
    for(int value : newArr){
      sum += value;
    }
    return sum;
  } else if (nums.length == 1){
    return nums[0];
  } else {
    return 0;
  }
}
