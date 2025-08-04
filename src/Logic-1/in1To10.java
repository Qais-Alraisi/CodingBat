public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode){
    if(n<2 || n>=10){
      return true;
    } else{
      return false;
    }
  }
  if(n>0 && n<11){
    return true;
  }
  return false;
}
