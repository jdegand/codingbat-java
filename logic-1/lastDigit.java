public boolean lastDigit(int a, int b, int c) {
    int count = 0;
    for(int i = 0; i < 3; i++){
      if(a % 10 == b % 10){
        count++;
      } else if (b % 10 == c % 10){
        count++;
      } else if (a % 10 == c % 10){
        count++;
      }
    }
    if(count >= 2){
      return true;
    }
    return false;
  }