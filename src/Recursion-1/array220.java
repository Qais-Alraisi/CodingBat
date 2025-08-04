public boolean array220(int[] nums, int index) {
   if(index+1>=nums.length){
    return false;
  } else if(nums[index+1]==nums[index]*10){
    return true;
  }
  return array220(nums,index+1);
}
