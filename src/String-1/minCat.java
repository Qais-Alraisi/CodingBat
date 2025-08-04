public String minCat(String a, String b) {
  if(a.length() == b.length()) {
    return a + b;
  }
  int shorter = Math.min(a.length(), b.length());
  return a.substring(a.length() - shorter) + b.substring(b.length() - shorter);
}
