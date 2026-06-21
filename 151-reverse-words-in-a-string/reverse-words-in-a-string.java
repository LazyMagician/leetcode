class Solution {
    public String reverseWords(String s) {
        String[] words = (s.trim()).split(" ");
        StringBuilder builder = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--){
            if(words[i].isEmpty())continue;
            // System.out.println("1"+words[i]+"2");
            builder.append(words[i].trim());
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}