class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        int [][] lcs = new int[len1+1][len2+1];

        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }  
        return lcs[len1][len2]; 
    }
}