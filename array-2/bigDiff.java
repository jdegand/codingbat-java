public int bigDiff(int[] nums) {
 int max = findMax(nums);
 int min = findMin(nums);
 return max - min;
}

public int findMax(int[] nums) {
  int maxSoFar = nums[0];  // use nums[0] as the max to start

  // Look at every element, starting at 1
  for (int i=1; i<nums.length; i++) {
    if (nums[i] > maxSoFar) {
      maxSoFar = nums[i];
    }
  }
  return maxSoFar;
}

public int findMin(int[] nums) {
  int minSoFar = nums[0];  // use nums[0] as the min to start

  // Look at every element, starting at 1
  for (int i=1; i<nums.length; i++) {
    if (nums[i] < minSoFar) {
      minSoFar = nums[i];
    }
  }
  return minSoFar;
}