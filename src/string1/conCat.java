public String conCat(String a, String b) {
  if(a.equals("")){
    return a+b;
  }
    if(b.equals("")){
    return a+b;
  }
  if(a.substring(a.length()-1).equals(b.substring(0,1))){
    return a+b.substring(1);
  }
  return a+b;
}
