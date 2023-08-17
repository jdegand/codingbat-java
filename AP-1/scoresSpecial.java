public int scoresSpecial(int[] a, int[] b) {
  return helper(a) + helper(b);
}

int helper(int[] arr) {
  int largest = 0;
  
  for(int i = 0; i < arr.length; i++) {
    if(largest < arr[i] && arr[i] % 10 == 0){
      largest = arr[i];
    }
  }
  return largest;
}
