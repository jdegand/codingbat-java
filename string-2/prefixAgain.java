public boolean prefixAgain(String str, int n) {
    String sub = str.substring(0,n);
    
    for(int i = n; i <= str.length() - n; i++){
      if(str.substring(i, n+i).equals(sub)){
        return true;
      }
    }
    return false;
}