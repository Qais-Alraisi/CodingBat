public int[] fix23(int[] nums) {
  for(int i = 1;i<nums.length;i++){
    if(nums[i-1]==2 &&  nums[i]==3){
      nums[i]=0;
    }
  }
  return nums;
}
