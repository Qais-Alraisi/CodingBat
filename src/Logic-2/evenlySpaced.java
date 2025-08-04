public boolean evenlySpaced(int a, int b, int c) {
  int largest = Math.max(a,Math.max(b,c));
  int smallest = Math.min(a,Math.min(b,c));
  int middle = a + b + c - largest - smallest;
  if(Math.abs(largest-middle) == Math.abs(middle-smallest)) return true;
  return false;
}
