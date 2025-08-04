public int sumNumbers(String str) {
  int sum = 0;
  for(int i = 0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i))) {
      for(int j = i + 1; j <= str.length(); j++) {
        if(j == str.length() || !Character.isDigit(str.charAt(j))) {
          int num = Integer.parseInt(str.substring(i, j));
          sum += num;
          i = j - 1; 
          break;
        }
      }
    }
  }
  return sum;
}
