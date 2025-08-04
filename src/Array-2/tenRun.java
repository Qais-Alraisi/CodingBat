public int[] tenRun(int[] nums) {
  int current = 0;
  boolean foundTen = false;
  int[] newNums = new int[nums.length];
  for(int i = 0;i<nums.length;i++){
    if(foundTen == false && nums[i]%10==0){
      current = nums[i];
      foundTen = true;
    } else if(foundTen == true && nums[i]%10==0){
      current =nums[i];
    } if(foundTen==true && nums[i]%10!=0){
      nums[i] = current;
    }
  }
  return nums;
}
