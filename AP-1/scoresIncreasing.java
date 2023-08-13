public boolean scoresIncreasing(int[] scores) {
  boolean result=true;
  for(int i=0;i < scores.length - 1;i++){
    if(scores[i] > scores[i+1]){
      result=false;
      break;
    }
  }
  return result;
}
