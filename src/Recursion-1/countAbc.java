public int countAbc(String str) {
  if(str.length()<3){
    return 0;
  } else if(str.charAt(0)=='a' && str.charAt(1)=='b' && (str.charAt(2)=='c' || str.charAt(2)=='a')){
    return 1+countAbc(str.substring(1));
  }
  return countAbc(str.substring(1));
  
}
