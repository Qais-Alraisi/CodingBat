public int[] post4(int[] nums) {
   int index=0;
   
   for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4){
    index = i;
   }
   }
  int[] newNums = new int[nums.length-index-1];

  for(int i = 0;i<newNums.length;i++){
    newNums[i]=nums[index+1+i];
  }
  return newNums;
}

