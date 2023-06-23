public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
  }
  
  public int fixTeen(int n) {
    if(n == 15){
      return 15;
    } else if(n == 16){
      return 16;
    } else if(n > 12 && n < 20){
      return 0;
    } else {
      return n;
    }
  }