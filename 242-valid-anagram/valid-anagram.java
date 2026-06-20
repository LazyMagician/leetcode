class Solution {
    public boolean isAnagram(String s, String t) {
        int [] freqArray = new int[26];
        
        if(s.length() != t.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            freqArray[c-'a'] +=1;
        }

        for(char c:t.toCharArray()){
            int key = c-'a';
            freqArray[key] -=1;
            
            if(freqArray[key] < 0){
                return false;
            }
        }
        return true;
    }
}