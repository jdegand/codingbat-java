public int matchUp(String[] a, String[] b) {
  int count = 0;
  
  for(int i = 0; i < a.length; i++){

      if(a[i] != "" && b[i] != "" && a[i].charAt(0) == b[i].charAt(0)) {
        count += 1;
      }
  }
  return count;
}
