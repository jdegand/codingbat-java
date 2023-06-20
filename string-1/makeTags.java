public String makeTags(String tag, String word) {
  String result = String.format("<%s>%s</%s>", tag, word, tag);
  return result;
}
