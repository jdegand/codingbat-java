public int caughtSpeeding(int speed, boolean isBirthday) {
    if((isBirthday && speed >= 86) || (!isBirthday && speed >= 81)){
      return 2;
    } else if((isBirthday && speed >= 66 && speed <= 85) || (!isBirthday && speed >= 61 && speed <= 80)){
      return 1;
    } else if((isBirthday && speed <= 65) || (!isBirthday && speed <= 60)){
      return 0;
    } 
    return 0;
  }
  
