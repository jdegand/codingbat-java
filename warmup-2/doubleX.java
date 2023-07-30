boolean doubleX(String str) {
  
  int firstX = str.indexOf("x");
  
  if(firstX == -1) {
    return false;
  }
  
  String sub = str.substring(firstX);
  
  return sub.startsWith("xx");
}
