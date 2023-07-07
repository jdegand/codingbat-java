public boolean sameStarChar(String str) {
  
  // doesn't work if you check that the chars are the same and return true
  
  for(int i = 1; i < str.length() - 1; i++){
    if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
        return false;
    }
  }
  return true;
}
