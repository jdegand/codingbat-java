public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;
  
  for(int i = start; i < end; i++) {
    int diff = Math.abs(heights[i+1] - heights[i]);
    sum += diff;
  }
  return sum;
}
