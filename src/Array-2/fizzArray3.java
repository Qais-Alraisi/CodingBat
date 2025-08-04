public int[] fizzArray3(int start, int end) {
  int[] nums = new int[end-start];
  int count=0;
  for(int i = start;i<end;i++){
    nums[count]=i;
    count++;
  }
  return nums;
}
