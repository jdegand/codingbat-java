public String extraFront(String str) {
  if(str.length() < 2){
    return str + str + str;
  } else {
    String s = str.substring(0, 2);
    return s + s + s;
  }
}
