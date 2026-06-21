class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();

        for(String str :strs){
            char[] chars= str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            // String sortedKey = str.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
            // groups.compute(sortedKey,(k,v)-> v!=null?v.add(str):new ArrayList<String>());
            groups.computeIfAbsent(sortedKey,k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());

    }
}