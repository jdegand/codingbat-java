public Map<String, String> pairs(String[] strings) {
  HashMap<String, String> result = new HashMap<>();
  for( String entry : strings){
    result.put(entry.substring(0,1), entry.substring(entry.length()-1));
  }
  return result;
}
