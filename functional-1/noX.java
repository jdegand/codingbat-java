// https://www.digitalocean.com/community/tutorials/java-remove-character-string

public List<String> noX(List<String> strings) {
  strings.replaceAll(s -> s.replace("x", ""));
  return strings;
}
