package warmup1;

public class endUp {
public String endUp(String str) {
  if (str.length() > 3){
    int bound = str.length()-3;
  String last = str.substring(bound);
  last = last.toUpperCase();
  return str.substring(0,bound) + last;
  }
  else{
    return str.toUpperCase();
  }
  
}
}
