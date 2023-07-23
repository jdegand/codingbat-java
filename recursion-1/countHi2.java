public int countHi2(String str) {
  if(str.length() <= 1) {
    return 0;
  }
  
  if(str.endsWith("hi") && (str.length() == 2 || str.charAt(str.length()-3) != 'x')) {
    return 1 + countHi2(str.substring(0, str.length() - 2));
  }
  
  return countHi2(str.substring(0, str.length() - 1));
}

/*

// too many scenarios to check

public int countHi2(String str) {
  if(str.length() <= 1) {
    return 0;
  }
  if(str.length() ==  2 && str.equals("hi")){
    return 1;
  }
  
  if(str.charAt(0) == 'x' && str.substring(1,3) == "hi"){
    return countHi2(str.substring(3));  
  }
  
  if(str.startsWith("hi")) {
    return 1 + countHi2(str.substring(2));
  }
  
  return countHi2(str.substring(1));
}

*/