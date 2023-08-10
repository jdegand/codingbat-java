public int maxBlock(String str) {
  int count = 0;
  
  if(str.length() == 0) return 0;
  
  for(int i = 0; i < str.length()-1; i++) {
    int j = i + 1;
    
    while(j < str.length() && str.charAt(j) == str.charAt(i)) {
      j += 1;
    }
    int block = j - i;
    
    if(block > count){
      count = block;
    }
  }

  return count;
}
