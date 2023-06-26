public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end-start];
     
  for(int i = 0; i < arr.length; i++) {
      int temp = i + start;    
      if(temp % 3 == 0 && temp % 5 == 0){
        arr[i] = "FizzBuzz";
      } else if( temp % 5 == 0){
        arr[i] = "Buzz";
      } else if( temp % 3 == 0){
        arr[i] = "Fizz";
      } else{
        arr[i] = String.valueOf(temp);
      }
  }              
  return arr;
}
 
