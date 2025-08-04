public int sumLimit(int a, int b) {
  int aLength = String.valueOf(a).length();
  int abLength = String.valueOf(a+b).length();
  if(aLength == abLength){
    return a+b;
  }
  return a;
  
}
