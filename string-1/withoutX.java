public String withoutX(String str) {
  
  if(str.length() == 0 || str.length() == 1){
    return "";
  }
  
  if(str.substring(str.length() -1).equals("x")) {
    str = str.substring(0, str.length()-1);  
  } 
  if (str.substring(0,1).equals("x")){
    str = str.substring(1);
  } 
  return str;
}
