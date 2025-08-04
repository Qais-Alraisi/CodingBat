public int centeredAverage(int[] nums) {
  int min = nums[0], max = nums[0], sum = 0;
  for (int x : nums) {
    sum += x;
    if (x < min) min = x;
    if (x > max) max = x;
  }
  return (sum - min - max) / (nums.length - 2);
}
