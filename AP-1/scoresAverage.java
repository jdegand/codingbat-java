public int scoresAverage(int[] scores) {
   int avg1 = average(scores, 0, scores.length/2);
   int avg2 = average(scores, scores.length/2, scores.length);
  
   if(avg1 > avg2){
     return avg1;
   } else {
     return avg2; 
   }
}

int average(int[] scores, int start, int end) {
  int sum = 0;
  
  for(int i = start; i < end; i++) {
    sum += scores[i];
  }
  return (int) sum / (end - start);
}
