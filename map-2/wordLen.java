public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> result = new HashMap();
  
  for( String entry : strings){
    result.put(entry, entry.length());
  }
  return result;
}
