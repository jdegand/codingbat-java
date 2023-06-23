public boolean evenlySpaced(int a, int b, int c) {
    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b,c));
    
    int medium = a;
    
    if(largest == b){
      if(smallest == a){
        medium = c;
      } else {
        medium = a;
      }
    } else if (largest == c){
      if(smallest == a){
        medium = b;
      } else {
        medium = a;
      }
    } else {
      if(smallest == b){
        medium = c;
      } else {
        medium = b;
      }
    }
    
    if(Math.abs(smallest-medium) == Math.abs(largest-medium)){
      return true;
    } else {
      return false;
    }
    
   }
