public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if(isAsleep){
      return false;
    } else if(isMorning && isMom){
      return true;
    } else if (isMorning && !isMom){
      return false;
    } else {
      return true;
    }
  }
