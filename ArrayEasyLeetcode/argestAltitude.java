class Solution {
    public int largestAltitude(int[] gain) {
        int [] result = new int [gain.length];
        int initialAltitude = 0;
        int larAlt = 0;
        for(int i=0;i<gain.length;i++){
            initialAltitude = initialAltitude + gain[i]; 
            altitude[i] = initialAltitude;
        }

        for(int i=0;i<altitude.length;i++){
            if(larAlt < altitude[i]){
                larAlt = altitude[i];
            }
        }
        return larAlt;

        
    }
}