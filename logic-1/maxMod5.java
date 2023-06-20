public int maxMod5(int a, int b) {
    if(a > b && a % 5 == b % 5){
      return b;
    } else if (b > a && a % 5 == b % 5){
      return a;
    } else if( b == a){
      return 0;
    } else if( b > a){
      return b;
    } else {
      return a;
    }
  }
  