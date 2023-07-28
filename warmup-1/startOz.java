public String startOz(String str) {
  if(str.length() < 2){
    return str;
  }
  if(str.startsWith("o") && str.substring(1).startsWith("z")) {
    return "oz";
  } else if (str.startsWith("o")) {
    return "o";
  } else if (str.substring(1).startsWith("z")) {
    return "z";
  } else {
    return "";
  }
  
}
