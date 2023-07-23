public String parenBit(String str) {
  // hard to determine what end condition should be

  if(str.charAt(0) != '(') {
    return parenBit(str.substring(1));
  } else if (str.charAt(str.length()-1) != ')') {
    return parenBit(str.substring(0, str.length() - 1));
  } else {
   return str; 
  }
}
