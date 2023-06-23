public int makeChocolate(int small, int big, int goal) {

    while(big > 0 && goal >= 5){
      goal -= 5; 
      big--;
    }
    
    if(small >= goal){
      return goal;
    } else {
      return -1;
    }
    
  }
  