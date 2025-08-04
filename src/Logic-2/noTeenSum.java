public int noTeenSum(int a, int b, int c) {
  int sum = 0;
  if(fixTeen(a) == a) sum+=a;
  if(fixTeen(b) == b) sum+=b;
  if(fixTeen(c) == c) sum+=c;
  return sum;
}

public int fixTeen(int n){
  if((n>12 && n<15) || (n>16 && n<20)){
    return 0;
  }
    return n;
}
