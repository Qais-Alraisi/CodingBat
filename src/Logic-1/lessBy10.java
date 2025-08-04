public boolean lessBy10(int a, int b, int c) {
  int abRange = Math.abs(a-b);
  int acRange = Math.abs(a-c);
  int bcRange = Math.abs(b-c);
  if(abRange > 9 || acRange > 9 || bcRange>9){
    return true;
  }
  return false;
  
}
