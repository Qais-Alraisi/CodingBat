boolean doubleX(String str) {
  int lim = 0;
  for (int i = 0; i < str.length() - 1; i++) {
    if (str.charAt(i) == 'x' && lim == 0) {
      lim++;
      if (str.charAt(i + 1) == 'x') {
        return true;
      }
    }
  }
  return false;
}
