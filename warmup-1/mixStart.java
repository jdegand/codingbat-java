public boolean mixStart(String str) {
  if(str.length() == 0){
    return false;
  }
  return str.substring(1).startsWith("ix");
}
