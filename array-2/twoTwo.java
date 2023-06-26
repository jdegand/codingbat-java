/*
public boolean twoTwo(int[] nums) {
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 2){
        count++;
      }
    }
    if(count % 2 == 1){
      return false;
    }
    return true;
  }
*/

public boolean twoTwo(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    int count = 0;
    while(i < nums.length && nums[i] == 2){
      count++;
      i++;
    }
    if(count == 1){
      return false;
    }
  }
  return true;
}
  