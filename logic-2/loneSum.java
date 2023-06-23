public int loneSum(int a, int b, int c) {
    if(a == b && b == c && a == c) {
      return 0;
    } else if(a == c){
      return b;
    } else if(a == b){
      return c;
    } else if(b == c){
      return a;
    } else {
      return a + b + c;
    }
  }
  