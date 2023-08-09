public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  
  for(int i = 0; i < str.length(); i++){
    if(str.substring(i).startsWith("is")){
      isCount += 1;
    } else if (str.substring(i).startsWith("not")){
      notCount += 1;
    }
  } 
  return isCount == notCount;
}
