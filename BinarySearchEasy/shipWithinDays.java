class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
    

        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            if(max < weights[i]){
                max = weights[i];
            }
        }
        int start = max;
        int end = sum;

        while(start<=end){
            int mid = start + (end-start)/2;
            int daysTake = findDays(weights,mid);
            if(daysTake<=days){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
      
    
    }
     static int findDays(int [] weights, int capacity){
        int days = 1,load =0;
        for(int i=0; i< weights.length; i++){
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;

     }
}