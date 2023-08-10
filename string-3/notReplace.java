public String notReplace(String str) {
  return str.replaceAll("\\b(is)\\b", "is not");
}