public int close10(int a, int b) {
  int max = Math.max(a,b);
  
  int aDiff = Math.abs(10-a);
  int bDiff = Math.abs(10-b);
  
  if(aDiff == bDiff){
    return 0;
  } else if ( aDiff < bDiff){
    return a;
  } else {
   return b; 
  }
}
