public int[] withoutTen(int[] nums) {
    int countNonTen = 0;
    for (int num : nums) {
        if (num != 10) {
            countNonTen++;
        }
    }
    int[] result = new int[nums.length];
    int index = 0;
    for (int num : nums) {
        if (num != 10) {
            result[index++] = num;
        }
    }
    while (index < nums.length) {
        result[index++] = 0;
    }
    return result;
}
