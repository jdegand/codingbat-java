public String oneTwo(String str) {
  String result = "";
  for(int i = 0; i < str.length() - 2; i+=3) {
      
    if(i < str.length()) {
      result += str.substring(i+1, i+3);
      result += str.substring(i,i+1);  
    }
      
  }
  return result;  
}
  