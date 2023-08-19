public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] arr = new String[n];
  int aIndex = 0;
  int bIndex = 0;
  int arrIndex = 0;
  
  while(arrIndex < n) {
    String aValue = a[aIndex];
    String bValue = b[bIndex];
    
    if(aValue.compareTo(bValue) == 0) {
      arr[arrIndex] = aValue;
      aIndex++;
      bIndex++;
      arrIndex++;
    } else if (aValue.compareTo(bValue) > 0) {
      arr[arrIndex] = bValue; 
      bIndex++; // got to increase only the value you use
      arrIndex++;
    } else if (aValue.compareTo(bValue) < 0) {
      arr[arrIndex] = aValue;
      aIndex++;
      arrIndex++;
    }
    
  }
  return arr;
}
