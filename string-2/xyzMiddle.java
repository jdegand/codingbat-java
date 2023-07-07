public boolean xyzMiddle(String str) {
  if(str.length() <= 2) {
    return false;
  }else if(str.length() % 2 == 0){
    return str.substring(str.length() / 2-1 , str.length() / 2+2).equals("xyz") ||
    str.substring(str.length() / 2-2, str.length() / 2+1).equals("xyz");
  } else {
    return str.substring(str.length() / 2-1,str.length() / 2+2).equals("xyz"); 
  }
}
