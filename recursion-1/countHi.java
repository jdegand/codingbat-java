public int countHi(String str) {
  if(str.length() <= 1){
    return 0;
  }
  if(str.substring(str.length()-2).equals("hi")){
    return 1 + countHi(str.substring(0,str.length()-2));
  }
  return 0 + countHi(str.substring(0,str.length()-1));
}
