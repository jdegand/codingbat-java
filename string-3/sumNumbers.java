public int sumNumbers(String str) {
  int sum = 0;
  
  for(int i = 0; i < str.length();i++) {
    if(!Character.isDigit(str.charAt(i))) {
      continue;
    } else {
      int j = i+1;
      
      while (j < str.length() && Character.isDigit(str.charAt(j))) {
        j++;
      }
      sum += Integer.parseInt(str.substring(i,j));
      i = j;
    } 
  }
  
  return sum;
}
