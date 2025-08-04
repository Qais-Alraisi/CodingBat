int countXX(String str) {
  int count = 0;
  for (int i = 1; i < str.length(); i++) {
    if (str.charAt(i) == 'x' && str.charAt(i - 1) == 'x') {
      count++;
    }
  }
  return count;
}
