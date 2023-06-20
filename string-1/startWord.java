public String startWord(String str, String word) {
  if(word.length() > str.length()){
    return "";
  } else {
    String first = str.substring(0, word.length());
    if(first.equals(word) || word.substring(1).equals(first.substring(1))){
      return first;
    } else {
      return "";
    }
  }
}
