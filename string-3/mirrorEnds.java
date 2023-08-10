public String mirrorEnds(String string) {
  String best = "";
  
  for(int i = 0; i <= string.length(); i++) {
    String sub = string.substring(0, i);
    String subReversed = new StringBuffer(sub).reverse().toString();
    
    if(string.startsWith(sub) && string.endsWith(subReversed)) {
      best = sub;
    }
  }
  return best;
}
