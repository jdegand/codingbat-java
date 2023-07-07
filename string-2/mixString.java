public String mixString(String a, String b) {
  int length = b.length();
  if(a.length() > b.length()){
    length = a.length();
  }
  
  String result = "";
  for (int i = 0; i < length; i++) {
    
    if(i < a.length()){
      result += a.charAt(i); 
    }
    if(i < b.length()) {
      result += b.charAt(i);
    }
  }
  return result;
}
