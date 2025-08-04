public String[] fizzBuzz(int start, int end) {
  String[] nums = new String[end-start];
  int count = 0;
  for(int i = start;i<end;i++){
    if(i%3==0 && i%5!=0){
      nums[count]="Fizz";
    } else if(i%5==0 && i%3!=0){
      nums[count]="Buzz";
    } else if(i%3==0 && i%5==0){
      nums[count]="FizzBuzz";
    } else{
      nums[count]=String.valueOf(i);
    }
    count++;
  }
  return nums;
}
