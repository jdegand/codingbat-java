public boolean hasBad(String str) {
  if(str.equals("")){
    return false;
  } else if(str.startsWith("bad")) {
    return true;
  } else if (str.substring(1).startsWith("bad")) {
    return true;
  } else {
    return false;
  }
}
