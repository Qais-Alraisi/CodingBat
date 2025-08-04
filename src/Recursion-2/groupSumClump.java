boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }
    int count = 1;
    for (int i = start + 1; i < nums.length; i++) {
        if (nums[i] == nums[start]) {
            count++;
        } else {
            break;
        }
    }
    int sum = count * nums[start];
    
    if (groupSumClump(start + count, nums, target - sum)) {
        return true;
    }
    return groupSumClump(start + count, nums, target);
}
