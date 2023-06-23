public boolean closeFar(int a, int b, int c) {
    int ab = Math.abs(a-b);
    int bc = Math.abs(b-c);
    int ac = Math.abs(a-c);
    
    if(ab <= 1){
      return bc >=2 && ac >=2;
    } else if(bc <= 1) {
      return ab >= 2 && ac >= 2;
    } else if(ac <= 1) {
      return ab >=  2 && bc >= 2;
    } else {
      return false;
    }
  }
  