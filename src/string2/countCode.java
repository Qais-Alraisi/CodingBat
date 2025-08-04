public int countCode(String str) {
  int count = 0;
  for(int i = 3;i<str.length();i++){
    if(str.charAt(i-3)=='c' && str.charAt(i-2)=='o' && str.charAt(i)=='e'){
      count++;
    }
  }
  return count;
}
