public boolean xyBalance(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') {
      boolean foundY = false;
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(j) == 'y') {
          foundY = true;
          break;
        }
      }
      if (!foundY) {
        return false; 
      }
    }
  }
  return true;
}
