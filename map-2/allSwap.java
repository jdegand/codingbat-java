public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++){
    if (map.containsKey(strings[i].substring(0,1))){
      String string = strings[i];
      strings[i] = strings[map.get(strings[i].substring(0,1))];
      strings[map.get(strings[i].substring(0,1))] = string;
      map.remove(strings[i].substring(0,1));
    } else {
      map.put(strings[i].substring(0,1), i);
    }
  }
  return strings;
}