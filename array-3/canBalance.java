// recursion-2 splitArray solution almost works 
// only [2,3,4,1,2] test fails
// the false condition runs 3 times ? - the other twice
// 6 == 6 

public boolean canBalance(int[] nums) {
 for(int i = 0; i < nums.length; i++){
   if(sum(nums, 0, i) == sum(nums, i, nums.length)) {
     return true;
   }
 }
 return false;
}

private int sum(int[] nums, int start, int end) {
  int sum = 0;
  
  for(int i = start; i < end; i++) {
    sum += nums[i];
  }
  return sum;
}
