package warmup1;

public class intMax {
public int intMax(int a, int b, int c) {
  int max;
  if ((a>b) && (a>c)){
    max = a;
  }
  else if((b>a) && (b>c)){
    max = b;
  }
  else{
    max = c;
  }
  return max;
}
}
