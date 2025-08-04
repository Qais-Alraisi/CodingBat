public String oneTwo(String str) {
  String newString = "";
  for(int i = 1;i<str.length()-1;i=i+3){
    newString = newString + str.charAt(i) + str.charAt(i+1) + str.charAt(i-1);
  }
  return newString;
  
}
