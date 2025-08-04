public boolean twoTwo(int[] nums) {
  if(nums.length==1 && nums[0]==2) return false;
  for(int i = 0;i<nums.length;i++){
    if(nums[i] == 2){
      if(i!=0 && nums[i-1]!=2){
        if(i!=nums.length-1 && nums[i+1]!=2){
        return false;
    } if(i==nums.length-1) return false;
  } 
  }
  }
  return true;
}
