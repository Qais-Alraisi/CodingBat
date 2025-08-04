public boolean canBalance(int[] nums) {
  int sum1 = 0,sum2=0;
  for(int num:nums){
    sum1+=num;
  }
  for(int i=0;i<nums.length;i++){
    sum2+=nums[i];
    if(sum2==sum1-sum2){
      return true;
    }
  }
  return false;
}
