public Map<String, String> firstChar(String[] strings) {
  Map<String, String> result = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
    if(result.containsKey(strings[i].substring(0,1))){
      result.put(strings[i].substring(0,1), (result.get(strings[i].substring(0,1)) + strings[i]));
    }  else {
      result.put(strings[i].substring(0,1), strings[i]);
    }
  }
  return result;
}
