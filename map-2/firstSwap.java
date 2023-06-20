public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++){
    String string = strings[i];
    String letter = string.substring(0,1);
    
    if(!map.containsKey(letter)){
      map.put(letter, i);
    } else if(map.get(letter) >= 0) {
      int prev = map.get(letter);
      strings[i] = strings[prev];
      strings[prev] = string;
      map.put(letter, -1);
    }
  }
  return strings;
}