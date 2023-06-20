public Map<String, String> topping3(Map<String, String> map) {
  
  if(map.get("potato") != null){
    map.put("fries", map.get("potato"));
  }
  
   if(map.get("salad") != null){
    map.put("spinach", map.get("salad"));
  }
  
  return map;
}
