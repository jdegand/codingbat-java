public int countAbc(String str) {
   if(str.length() < 3){
    return 0;
  }
  // str.substring(0, 3) didn't work
  if(str.startsWith("abc") || str.startsWith("aba")) {
    return 1 + countAbc(str.substring(1));
  } 
  
  return countAbc(str.substring(1));
}
