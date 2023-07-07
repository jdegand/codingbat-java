public String repeatFront(String str, int n) {
    String result = "";
    for(int i = 0; i < n; i++){
       
      String sub = str.substring(0,n-i);
      result += sub; 
    }
    return result;
}
  