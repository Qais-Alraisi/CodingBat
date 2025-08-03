public String stringX(String str) {
 String finalStr="";
 if(str.length()>2){
  for(int i=1;i<str.length()-1;i++){
   if(!(str.charAt(i)=='x')){
    finalStr+=str.charAt(i);
   }
  }
  if(str.charAt(0)=='x'){
   finalStr="x"+finalStr;
  }else{
   finalStr=str.charAt(0)+finalStr;
  }
  if(str.charAt(str.length()-1)=='x'){
   finalStr=finalStr+"x";
  }else{
   finalStr=finalStr+str.charAt(str.length()-1);
  }
 }else{
  finalStr=str;
 }
 return finalStr;
}
