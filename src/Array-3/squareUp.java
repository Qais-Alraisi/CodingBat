public int[] squareUp(int n){
    int[] nums = new int[n*n];
    for(int i=1;i<=n;i++){
        for(int j=0;j<i;j++){
           nums[n*i - j - 1]=j+1;
        }
    }
    return nums;
}
