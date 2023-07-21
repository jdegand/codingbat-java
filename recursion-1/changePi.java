public String changePi(String str) {
  
  // combination of countHi & changeXY
  
  if(str.length() <= 1){
    return str;
  }
  if(str.substring(str.length()-2).equals("pi")){
    return  changePi(str.substring(0,str.length()-2)) + "3.14";
  }
  return changePi(str.substring(0,str.length()-1)) + str.charAt(str.length()-1);
}
