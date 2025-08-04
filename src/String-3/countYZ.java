public int countYZ(String str) {
  int count = 0;
  for(int i = 0;i<str.length();i++){
    char c = Character.toLowerCase(str.charAt(i));
    if(c=='y' || c=='z'){
      if(i==str.length()-1 || !Character.isLetter(str.charAt(i+1))){
        count++;
      }
    }
}
return count;
}
