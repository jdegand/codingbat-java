public int[] squareUp(int n) {
  int[] result = new int[n * n];
  int pos = 0;
 
  for (int i = 1; i <= n; i++) {
    for (int k = 1; k <= n - i; k++) {
        result[pos++] = 0;
      } 
      for (int j = i; j > 0; j--) {
        result[pos++] = j; 
      }
  }
  return result;
}
