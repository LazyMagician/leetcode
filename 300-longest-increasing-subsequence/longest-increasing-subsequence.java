class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis,1);

        int maxLis = 1;
        for(int i=1;i<nums.length;i++){
            // System.out.println("i"+nums[i]);
            for(int j=0;j<=i-1;j++){
                // System.out.print(nums[j]+":"+lis[j]+" ,");
                if(nums[i] > nums[j]){
                    lis[i] = Math.max(lis[j]+1,lis[i]);
                    maxLis = Math.max(lis[i],maxLis);
                }
            }
            // System.out.println();
        }
        
        // for(int i=0;i<nums.length;i++){

        //     System.out.print(lis[i]);
        // }

        return maxLis;


    }
}