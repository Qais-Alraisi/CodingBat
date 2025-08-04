public String repeatSeparator(String word, String sep, int count) {
  String newString = "";
  if(count>0){
  for(int i = 0;i<count-1;i++){
    newString = newString + word + sep;
  }
  return newString+word;
}
return "";
}

