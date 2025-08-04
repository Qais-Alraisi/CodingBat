public String withoutX(String str) {
  if (str.length() == 0) return str;
  if (str.length() == 1) {
    if (str.charAt(0) == 'x') {
      return "";
    } else {
      return str;
    }
  }
  int start = 0;
  int end = str.length();
  if (str.charAt(0) == 'x') {
    start = 1;
  }
  if (str.charAt(str.length() - 1) == 'x') {
    end = end - 1;
  }
  return str.substring(start, end);
}

