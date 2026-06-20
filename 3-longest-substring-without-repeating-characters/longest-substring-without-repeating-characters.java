class Solution {
    public int lengthOfLongestSubstring(String s) {
      int[] lastseen = new int[256];
      int l=0,maxLen = 0;
      Arrays.fill(lastseen,-1);
       
      for(int r=0;r<s.length();r++){
        char c = s.charAt(r);
         if(lastseen[c] >=l){
            l = lastseen[c]+1;
         }
         maxLen = Math.max(maxLen,r-l+1);
         lastseen[c]=r;
      }
      return maxLen;   
    }
}