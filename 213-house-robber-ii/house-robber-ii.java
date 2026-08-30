class Solution {
    public int rob(int[] nums) {
        int houselen = nums.length;
        if( houselen == 1 ) return nums[0];
        int firstHouse =nums[0], secondHouse = Integer.max(nums[0],nums[1]), currHouse = secondHouse;

        if( houselen == 2 ) return secondHouse;
        for(int i=2;i<houselen-1;i++){
            currHouse = Integer.max(firstHouse+nums[i],secondHouse);
            firstHouse = secondHouse;
            secondHouse = currHouse;
        } 
        int withFirstHouse = currHouse;
        firstHouse = 0;
        secondHouse = nums[1];
        for(int i=2;i<houselen;i++){
            currHouse = Integer.max(firstHouse+nums[i],secondHouse);
            firstHouse = secondHouse;
            secondHouse = currHouse;
        } 

        return Integer.max(currHouse,withFirstHouse);

    }
}