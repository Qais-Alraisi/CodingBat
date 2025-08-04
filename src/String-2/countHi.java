public int countHi(String str) {
  int count=0;
  for(int i=1;i<str.length();i++){
    if(str.charAt(i-1) == 'h' && str.charAt(i) == 'i'){
    count++;
  }
}
return count;
}
