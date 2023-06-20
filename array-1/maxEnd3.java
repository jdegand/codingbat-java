public int[] maxEnd3(int[] nums) {
  if(nums[0] > nums[nums.length-1]){
    int newArr[] = new int[] {nums[0], nums[0], nums[0]};
    return newArr;
  } else if(nums[nums.length-1] > nums[0]){
    int newArr[] = new int[] {nums[nums.length-1], nums[nums.length-1], nums[nums.length-1]};
    return newArr;
  } else if (nums[nums.length-1] == nums[0]){
    int newArr[] = new int[] {nums[0], nums[0], nums[0]};
    return newArr;
  }
  return nums;
}
