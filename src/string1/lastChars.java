public String lastChars(String a, String b) {
  String first = "";
  String last = "";
  if (a.equals("")){
    first = "@";
  } else{
       first = a.substring(0,1);
  }
  if (b.equals("")){
    last = "@";
  } else{
        last = b.substring(b.length()-1);
  }
  return first+last;
}
