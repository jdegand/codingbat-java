public boolean xyzThere(String str) {

  //return !str.contains(".xyz") && str.contains("xyz");

  if(str.startsWith("xyz") || str.equals("xyz")){
      return true;
  }
  
  for(int i = 1; i < str.length()-2; i++){
    
    if(str.substring(i,i + 3).equals("xyz") && str.charAt(i-1) != '.'){
      return true;
    }
  }
  return false;
}
