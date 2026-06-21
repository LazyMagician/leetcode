class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new ArrayList[nums.length+1];
        Map<Integer,Integer> eleVsFreq = new HashMap<>();
        
        for(int num:nums){
            eleVsFreq.compute(num,(m,v)->v!=null? v+1:1 );
        }

        for(int key : eleVsFreq.keySet()){
            if(freq[eleVsFreq.get(key)] == null){
                freq[eleVsFreq.get(key)] = new ArrayList<>();                
            }
            freq[eleVsFreq.get(key)].add(key);
        }

        int[] topKEle = new int[k];
        for(int i=freq.length-1;i>=0;i--){
            if(k == 0)break;
            if(freq[i]!=null){
                for(int ele:freq[i]){
                    topKEle[--k]=ele;
                    if(k == 0)break;
                }
            }
            // if(k < 0)break;
        }
        return topKEle;
    }
}