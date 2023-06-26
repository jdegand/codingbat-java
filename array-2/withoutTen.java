public int[] withoutTen(int[] nums) {
    int[] arr = new int[nums.length];
    int index = 0;
    
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 10){
       arr[index] = nums[i];
       index++;
      }
    }
    
    return arr;
}
