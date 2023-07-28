public boolean loneTeen(int a, int b) {
  //return (a >= 13 && a <= 19 && b < 13 || b > 19) || (b >= 13 && b <= 19 && a < 13 || a > 19);
  boolean aStatus = a >= 13 && a <= 19;
  boolean bStatus = b >= 13 && b <= 19;
  
  return (aStatus && !bStatus) || (bStatus && !aStatus); 
}
