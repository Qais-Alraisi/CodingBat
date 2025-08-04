public String mixString(String a, String b) {
  int maxLength = Math.max(a.length(),b.length());
  String newString="";
  for(int i=0;i<maxLength;i++){
    if(i<a.length()) newString += a.charAt(i);
      if(i<b.length()) newString += b.charAt(i);
  }
  return newString;
}
