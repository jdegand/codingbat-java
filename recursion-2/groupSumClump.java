public boolean groupSumClump(int start, int[] nums, int target) {
  int sum = 0;
  int count = 1;
  if(nums.length <= start) {
    return target == 0;
  }
    sum = nums[start];
    for (int i = start + 1; i < nums.length; i++)
      if (nums[i] == nums[start]) {
        sum += nums[i];
        count++;
      }
  return groupSumClump(start + count, nums, target - sum) || groupSumClump(start + count, nums, target);
}
