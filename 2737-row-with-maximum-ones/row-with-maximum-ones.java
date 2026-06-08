class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int ones = 0;
        int maxOnes = 0;
        int index = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1)
                    ones++;
            }
            if(ones > maxOnes){
                maxOnes = ones;
                index = i;
            }
            ones =0 ;
        }
        return new int[] {index,maxOnes};
    }
}