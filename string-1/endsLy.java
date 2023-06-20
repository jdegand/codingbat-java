public boolean endsLy(String str) {
  if(str.length() > 2){
    String last2 = str.substring(str.length()-2);
    
    if(last2.equals("ly")){
      return true;
    } else {
      return false;
    }
  } else if (str.length() == 2) {
    if(str.equals("ly")){
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}
