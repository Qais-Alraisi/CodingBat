public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  for(int i = 2;i<str.length();i++){
    if(str.charAt(i-2)=='c' && str.charAt(i-1)=='a' && str.charAt(i)=='t'){
      catCount++;
    }
    if(str.charAt(i-2)=='d' && str.charAt(i-1)=='o' && str.charAt(i)=='g'){
      dogCount++;
    }
  }
  if(catCount == dogCount) return true;
  return false;
}
