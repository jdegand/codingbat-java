public String minCat(String a, String b) {
  int aLength = a.length();
  int bLength = b.length();
  
  if(aLength == bLength){
    return a + b;
  } else if(bLength > aLength){
    b = b.substring(b.length() - aLength);
    return a + b;
  } else {
    a = a.substring(a.length()-bLength);
    return a + b;
  }
}
