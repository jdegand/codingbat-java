public boolean frontAgain(String str) {
  if(str.length() < 2){
    return false;
  } else if(str.length() >= 2){
    String firstTwo = str.substring(0,2);
    String lastTwo = str.substring(str.length()-2); 
    if(firstTwo.equals(lastTwo)) {
      return true; 
    } else {
      return false;
    }
  } else {
    return false;
  }
}
