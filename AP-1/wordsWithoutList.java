public List wordsWithoutList(String[] words, int len) {

  List result = new ArrayList<String>();

  for(String word : words) {
    if(word.length() == len) {
      continue;
    }
    result.add(word);
  }
  return result;
}
