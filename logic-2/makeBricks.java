public boolean makeBricks(int small, int big, int goal) {
    if(big * 5 + small < goal || goal % 5 > small){
      return false;
    } 
    return true;
  }
  