public int[] reverse3(int[] nums) {
    int[] newArr = new int[nums.length];
    int count = nums.length;
    for (int i = 0; i < nums.length; i++) {
      newArr[count - 1] = nums[i];
      count = count - 1;
    }
      
    return newArr;
}
