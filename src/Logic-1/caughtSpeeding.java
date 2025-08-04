public int caughtSpeeding(int speed, boolean isBirthday) {
  int birthday = isBirthday ? 5 : 0;
  if(speed<=60+birthday){
    return 0;
  } else if(speed<=80+birthday){
    return 1;
  } else{
    return 2;
  }
}
