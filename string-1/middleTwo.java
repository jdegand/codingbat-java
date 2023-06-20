public String middleTwo(String str) {
  int middle = str.length() / 2;
  
  return str.substring(middle-1, middle+1);
}