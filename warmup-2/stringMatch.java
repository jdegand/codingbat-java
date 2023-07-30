public int stringMatch(String a, String b) {
  
  int length;
  
  if(a.length() > b.length()) {
    length = b.length();
  } else {
    length = a.length();
  }
  
  int count = 0;
  for(int i = 0; i < length-1; i++){
    if(a.substring(i, i+2).equals(b.substring(i, i+2))){
      count += 1;
    }
  }
  return count;
}
