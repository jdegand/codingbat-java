public int[] biggerTwo(int[] a, int[] b) {
  int sumA = 0;
  int sumB = 0;
  
  for(int value: a){
    sumA += value;
  }
  
  for(int value: b){
    sumB += value;
  }
  
  if(sumA == sumB){
    return a;
  } else if (sumA > sumB) {
    return a;
  } else {
    return b;
  }
}
