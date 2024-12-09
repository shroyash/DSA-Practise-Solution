class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int m = mat.length;
        for(int i =0 ; i<m; i++){
         sum += mat[i][i];
         sum += mat[i][m-i-1];
        }

        
      
        if(m%2 != 0){
           int mid = m/2;
            sum = sum - mat[mid][mid];
        }
        return sum;
        
}
}