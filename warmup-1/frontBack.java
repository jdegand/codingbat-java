public String frontBack(String str) {
  
  if(str.length() < 2){
    return str;
  } 
  
  String rest = str.substring(1, str.length()-1);
  char first = str.charAt(0);
  char last = str.charAt(str.length()-1);
  return last + rest + first;
}
