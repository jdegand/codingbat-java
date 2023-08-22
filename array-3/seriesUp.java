public int[] seriesUp(int n) {
    int[] array = new int[n*(n + 1)/2];
    int index = 0;
    
    for(int i = 1; i <= n; i++){ // group
      for(int j = 1; j < (i+1); j++){ // value
        array[index] = j;
        index++;
      }           
    }
    return array;
}
