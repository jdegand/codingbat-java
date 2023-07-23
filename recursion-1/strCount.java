public int strCount(String str, String sub) {
  if(sub.length() > str.length()){
    return 0;
  }
  if(str.startsWith(sub)) {
    return 1 + strCount(str.substring(sub.length()), sub);
  }
  return 0 + strCount(str.substring(1), sub);
}
