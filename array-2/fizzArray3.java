public int[] fizzArray3(int start, int end) {
    int n = end-start;
    int[] arr = new int[n];
    int count = start;
   
   for(int i = 0; i < n; i++) {
       arr[i] = count;
       count++;
   }              
   return arr;
}
