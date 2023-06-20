public int[] rotateLeft3(int[] nums) {

  int newArr[] = new int [nums.length];

  newArr[0] = nums[1];
  
  newArr[1] = nums[2];
  
  newArr[2] = nums[0];
  
  return newArr;

}