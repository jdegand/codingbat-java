public int sumHeights2(int[] heights, int start, int end) {
    int sum = 0;
  
    for(int i = start; i < end; i++) {
        int diff = heights[i+1] - heights[i];
    
        if(diff > 0) {
            diff *= 2;
        } else {
         diff = Math.abs(diff);
        }

        sum += diff;
    }
    return sum;
}
