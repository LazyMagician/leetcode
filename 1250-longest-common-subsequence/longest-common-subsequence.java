class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        
        int[] prevRow = new int[text2.length()+1] ;
        int[] currRow = new int[text2.length()+1] ;


        for(int i=1;i<=len1;i++){
            currRow = new int[len2+1];
            for(int j=1;j<=len2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    currRow[j] = prevRow[j-1]+1;
                }else{
                    currRow[j] = Math.max(prevRow[j],currRow[j-1]);
                }
            }
            prevRow = currRow.clone();

        }

        return currRow[len2];
    }
}