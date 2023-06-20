public String nTwice(String str, int n) {
  String first = str.substring(0, n);
  String last = str.substring(str.length() - n);
  
  return first + last;
}
