public boolean sameEnds(int[] nums, int len) {
  // Arrays.copyOfRange twice with different indexes and compare ?
  for(int i = 0; i < len; i++){
    if(nums.length > len && nums[i] != nums[nums.length - len + i]){
      return false;
    }
  }
  return true;
}
