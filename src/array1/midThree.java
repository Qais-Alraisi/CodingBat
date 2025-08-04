public int[] midThree(int[] nums) {
  if(nums.length == 3){
    return nums;
  }
  return new int[]{nums[nums.length/2 - 1],nums[nums.length/2],nums[nums.length/2 + 1]};
  
}
