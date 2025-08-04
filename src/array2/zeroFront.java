public int[] zeroFront(int[] nums) {
  int[] newNums = new int[nums.length];
  int zeroPos = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      newNums[zeroPos++] = 0;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
      newNums[zeroPos++] = nums[i];
    }
  }
  return newNums;
}
