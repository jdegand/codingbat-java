public String sameEnds(String string) {
  String best = "";
  String tmp = "";
  for (int i = 0; i < string.length(); i++) {
    tmp += string.charAt(i);
    if (i < string.length() / 2 && 
    tmp.equals(string.substring(string.length()-tmp.length(),string.length())))
      best = tmp;
  }
  return best;
}
