public boolean endOther(String a, String b) {
  String lowercaseA = a.toLowerCase();
  String lowercaseB = b.toLowerCase();
    
  return lowercaseA.endsWith(lowercaseB) || lowercaseB.endsWith(lowercaseA); 
}
  