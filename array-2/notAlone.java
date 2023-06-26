/*

public int[] notAlone(int[] nums, int val) {
  int first = nums[0];
  for(int i = 1; i < nums.length-1; i++){
    if(nums[i] ==  val && nums[0] != nums[i]){
      if(nums[i] != nums[i+1]){
        if(nums[0] > nums[i+1]){
          nums[i] = nums[0];
        } else {
          nums[i] = nums[i+1];
        }
      }
    }
  }
  return nums;
}
*/

public int[] notAlone(int[] nums, int val) {
  for(int i = 1; i < nums.length-1; i++){
    if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1]){
      nums[i] = Math.max(nums[i-1], nums[i+1]);
    }
  }
  return nums;
}
