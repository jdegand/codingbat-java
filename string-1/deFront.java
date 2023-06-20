public String deFront(String str) {    
  
  if(str.length() > 2){
      String first = str.substring(0,1);
      String second = str.substring(1,2);
      
      String result = "";
      String lastPart = str.substring(2);
      
      if(first.equals("a")){
        result += "a";
      }
      
      if(second.equals("b")){
        result += "b";
      }
      
      return result += lastPart;
      
  } else if(str.length() == 2) {
     String first = str.substring(0,1);
     String second = str.substring(1,2);
      
     String result = "";
     
      if(first.equals("a")){
        result += "a";
      }
      
      if(second.equals("b")){
        result += "b";
      }
      
      return result;
    
    
  } else {
    return "";
  }
  
}