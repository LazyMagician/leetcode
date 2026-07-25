class Solution {
    public String longestPalindrome(String s) {
        int l =0,r=0;
        Integer maxLen = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            // System.out.println(i+","+i);
            Integer[] evenLenArr = expand(s,i,i);
            int tmpL = evenLenArr[0];
            int tmpR = evenLenArr[1];
            
            if((tmpR-tmpL+1) > maxLen){
                maxLen = tmpR-tmpL+1;
                l=tmpL;
                r=tmpR; 
            }
            //  System.out.println(i+"odd"+" "+l+","+r+","+maxLen);

            // System.out.println(i+","+(i+1));
            Integer[] oddLenArr = expand(s,i,i+1);
            tmpL = oddLenArr[0];
            tmpR = oddLenArr[1];
            
            if((tmpR-tmpL+1) > maxLen){
                maxLen = tmpR-tmpL+1;
                l=tmpL;
                r=tmpR; 
            }
            // if(oddLen > maxLen){
            //     maxLen = oddLen;
            //     l = i;
            //     r = i+1;
            // }
            //  System.out.println(i+"even"+" "+l+","+r+","+maxLen);

        }

    // System.out.println(l+","+r);
        return s.substring(l,r+1);

    }

   public Integer[] expand( String s, int l, int r){
    if( r == s.length() || s.charAt(l) != s.charAt(r)){
                // System.out.println("*"+l+" --- "+r);

        return new Integer[]{-1,-1};
    }
    while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
    	l--;
    	r++;
    }
        // System.out.println(l+" --- "+r);
    // System.out.println("max"+(r-l-1));
    
        return new Integer[]{l+1,r-1};
}
}