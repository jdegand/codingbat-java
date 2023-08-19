public int userCompare(String aName, int aId, String bName, int bId) {
  
  if(aName == bName) {
    if(aId == bId) {
      return 0;
    } else if (aId > bId) {
      return 1;
    } else {
      return -1;
    }
  } else {
    if(aName.compareTo(bName) == 0) {
        if(aId == bId) {
          return 0;
        } else if (aId > bId) {
          return 1;
        } else {
          return -1;
        }
    } else if(aName.compareTo(bName) < 0) {
      return -1;
    } else if(aName.compareTo(bName) > 0) {
      return 1;
    } 
  }
  return 0;
}
