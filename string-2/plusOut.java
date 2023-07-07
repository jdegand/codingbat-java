public String plusOut(String str, String word) {

    String result = "";
  
    for(int i = 0; i < str.length(); i++){
      if(str.substring(i).startsWith(word)){
        result += word;
        i += word.length() - 1;
      } else {
        result += '+';
      }
    }
    return result;
    
}
  