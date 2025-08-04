public String repeatFront(String str, int n) {
  String newString = "";
  for(;n>0;n--){
    newString+=str.substring(0,n);
  }
  return newString;
}
