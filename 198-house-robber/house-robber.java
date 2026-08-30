class Solution {
    public int rob(int[] nums) {
        int houseLen = nums.length;
        int[] maxRob = new int[houseLen];

        if(houseLen <= 1) return nums[0];
        maxRob[0] = nums[0];
        maxRob[1] = Integer.max(maxRob[0],nums[1]);

        for(int i =2; i< houseLen;i++){
            maxRob[i] = Integer.max(maxRob[i-1],maxRob[i-2]+nums[i]);
        }       
        return maxRob[houseLen-1];
    }
}