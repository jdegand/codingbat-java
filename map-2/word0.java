public Map<String, Integer> word0(String[] strings) {
  HashMap<String, Integer>result = new HashMap<>();

  for(String entry : strings){
    result.put(entry, 0);
  }
  return result;
}
