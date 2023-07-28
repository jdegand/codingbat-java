public String delDel(String str) {
  
  if(str.length() == 0) return str;
  
  if(str.substring(1).startsWith("del")) {
    return str.charAt(0) + str.substring(4);
  }
  return str;
}
