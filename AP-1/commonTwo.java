public int commonTwo(String[] a, String[] b) {
  int sharedCount = 0;
  int aIndex = 0;
  int bIndex = 0;
  
  while(aIndex < a.length && bIndex < b.length) {
    
    if(a[aIndex].compareTo(b[bIndex]) < 0) {
      aIndex++;
    } else if (a[aIndex].compareTo(b[bIndex]) > 0) {
      bIndex++;
    } else {
      sharedCount++;
      //aIndex++;
      //bIndex++;
      
      /* need to check for duplicates -  I originally just incremented both */
      String dup = a[aIndex];
      
      // stuck on same letter in each array
      while(aIndex < a.length && a[aIndex] == dup) {
        aIndex++;
      }
      
      while(bIndex < b.length && b[bIndex] == dup) {
        bIndex++;
      }
    }
  }
  return sharedCount;
}
