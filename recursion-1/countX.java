public int countX(String str) {
  if(str.length() == 0){
    return 0;
  }
  char last = str.charAt(str.length()-1);
  if(last == 'x'){
    return 1 + countX(str.substring(0,str.length()-1));
  }
  return 0 + countX(str.substring(0,str.length()-1));
}
