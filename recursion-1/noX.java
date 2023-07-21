public String noX(String str) {
  if(str.length() == 0){
    return str;
  }
  if(str.substring(str.length()-1).equals("x")){
    return  noX(str.substring(0,str.length()-1));
  }
  return noX(str.substring(0,str.length()-1)) + str.charAt(str.length()-1);
}
