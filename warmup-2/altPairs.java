public String altPairs(String str) {
    String result = "";
    
    for(int i = 0; i < str.length(); i+=4) {
      int index = i + 2;
      if (index > str.length()) {
        index = str.length();
      }
      result = result + str.substring(i, index);
    }
    return result;
}
  