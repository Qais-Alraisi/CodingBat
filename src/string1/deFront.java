public String deFront(String str) {
  String finalString="";
  if(str.substring(0,1).equals("a")){
    finalString+="a";
  }
  if(str.substring(1,2).equals("b")){
    finalString+="b";
  }
  return finalString+str.substring(2);
  }

