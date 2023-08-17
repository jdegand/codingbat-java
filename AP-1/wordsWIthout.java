public String[] wordsWithout(String[] words, String target) {
  String[] arr = new String[words.length];
  
  int index = 0;
  
  for(int i = 0; i < words.length; i++) {
    if(words[i] != target) {
      arr[index] = words[i];
      index++;
    }
  }
  return Arrays.stream(arr).filter(Objects::nonNull).toArray(String[]::new);
}
