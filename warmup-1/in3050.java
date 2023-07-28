public boolean in3050(int a, int b) {
  boolean aRange = (a >= 30 && a <= 40);
  boolean bRange = (b >= 30 && b <= 40);
  
  boolean aRange2 = (a >= 40 && a <= 50);
  boolean bRange2 = (b >= 40 && b <= 50);
  
  return (aRange && bRange) || (aRange2 && bRange2);
}
