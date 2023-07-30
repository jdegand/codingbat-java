public String frontTimes(String str, int n) {
  String s;
  String result = ""; 
  if(str.length() < 3 ){
    s = str;
  } else {
    s = str.substring(0,3);
  }
  for(int i = 0; i < n; i++){
    result += s;
  }
  return result;
}
