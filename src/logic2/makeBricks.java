public boolean makeBricks(int small, int big, int goal) {
  int smallCount = 0;
  int bigCount = 0;
  for (int i = 0;goal>0;i++){
    if(goal>=5 && bigCount<big){
      goal = goal-5;
      bigCount++;
    } else if(goal>0 && smallCount<small){
      goal=goal-1;
      smallCount++;
    } else{
      break;
    }
  }
  if (bigCount<=big && smallCount<=small && goal==0) return true;
  return false;
}
