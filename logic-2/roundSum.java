public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }
  
  public int round10(int num){
   int remainder = num % 10;
    num -= remainder;
    if (remainder >= 5) {
      num += 10;
    }
    return num;
  }
  