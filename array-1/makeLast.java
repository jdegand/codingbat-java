public int[] makeLast(int[] nums) {  
  int length = nums.length * 2;
  int[] newArr = new int[length];
  newArr[newArr.length-1] = nums[nums.length-1];
  return newArr;
}
