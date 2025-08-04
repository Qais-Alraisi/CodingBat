public int[] pre4(int[] nums) {
   int index=0;
   
   for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4){
    index = i;
    break;
   }
   }
  int[] newNums = new int[index];

  for(int i = 0;i<index;i++){
    newNums[i]=nums[i];
  }
  return newNums;
}
