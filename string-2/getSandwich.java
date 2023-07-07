public String getSandwich(String str) {
  int firstIndex = str.indexOf("bread");
    
  int lastIndex = str.lastIndexOf("bread");
    
  if(firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex){
    return "";
  } else {
      return str.substring(firstIndex+5, lastIndex);
  }
}
  