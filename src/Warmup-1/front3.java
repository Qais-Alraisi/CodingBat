package warmup1;
public class front3{
public String front3(String str) {
  if(str.length() < 3){
    String first = str.substring(0,str.length());
    return first + first + first;
  }
  String first2 = str.substring(0,3);
  return first2 + first2 + first2;
}
}
