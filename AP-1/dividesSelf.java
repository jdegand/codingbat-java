public boolean dividesSelf(int n) {
  int number = n;

  while (n > 0 ) {
    
      if(n % 10 == 0 || number % (n % 10) != 0){
        return false;
      } 
      n = n / 10;
  }
  return true;
}
