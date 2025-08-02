package warmup1;

public class everyNth {
public String everyNth(String str, int n) {
  String newString = "";
  for (int i = 0;i<str.length();i=i+n){
    newString = newString + str.charAt(i);
  }
  return newString;
}
}
