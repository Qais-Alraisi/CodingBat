public boolean no14(int[] nums) {
  boolean foundOne=false, foundFour=false;
  for(int num:nums){
    if (num==1) foundOne = true;
    if (num==4) foundFour = true;
  }
  return !(foundOne&&foundFour);
}
