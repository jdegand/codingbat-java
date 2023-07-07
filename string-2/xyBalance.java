public boolean xyBalance(String str) {
    int yIndex = str.lastIndexOf("y");
    int xIndex = str.lastIndexOf("x");
    return yIndex >= xIndex;
}
  