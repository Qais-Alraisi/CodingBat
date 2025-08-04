public int bigDiff(int[] nums) {
  int tempMax = nums[0];
  int tempMin = nums[0];
  for(int i = 1;i<nums.length;i++){
    if(Math.max(nums[i],nums[i-1]) > tempMax) tempMax = Math.max(nums[i],nums[i-1]);
    if(Math.min(nums[i],nums[i-1]) < tempMin) tempMin = Math.min(nums[i],nums[i-1]);
  }
  return (tempMax - tempMin);
  
}
