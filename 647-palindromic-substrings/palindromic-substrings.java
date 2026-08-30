class Solution {
    public int countSubstrings(String s) {
        
        int noOfSubs = 0;
        for(int i=0;i<s.length();i++){
            
            noOfSubs += expand(s,i,i);
            noOfSubs += expand(s,i,i+1);
        }
        return noOfSubs;
    }



    public int expand(String s, int l,int r){
        int count = 0;
        if( r >= s.length() || s.charAt(l) != s.charAt(r) ){
            return count;
        }

        while( l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }

}