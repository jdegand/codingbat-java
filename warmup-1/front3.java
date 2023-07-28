public String front3(String str) {
  String sub;
  
  if(str.length() <= 3){
    sub = str;
  } else {
    sub = str.substring(0,3); 
  }
  return sub + sub + sub;
}
