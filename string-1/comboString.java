public String comboString(String a, String b) {
  int aLength = a.length();
  int bLength = b.length();
  
  if(aLength > bLength){
    return b + a + b;
  } else {
    return a + b + a;
  }  
}
