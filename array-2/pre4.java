public int[] pre4(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4){
      break;
    }
    count++;
  }
  int[] arr = new int[count];
  for(int i = 0; i < count; i++){
    arr[i] = nums[i];
  }
  return arr;
}
  