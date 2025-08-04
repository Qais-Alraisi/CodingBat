public boolean endOther(String a, String b) {
  int aLength=a.length();
  int bLength=b.length();
  if(aLength>=bLength){
  return a.substring(aLength - bLength).equalsIgnoreCase(b);
    } else{
      return b.substring(bLength - aLength).equalsIgnoreCase(a);
    }
}

  
   
