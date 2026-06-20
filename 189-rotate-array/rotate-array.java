class Solution {
    public void rotate(int[] nums, int k) {
        
        // int rotateParam = k%nums.length;
        
        int l=0,r=nums.length-1,size=nums.length;
        if(k%size ==0){
            return;
        }

        // reverse all
        reverse(nums,l,r);

        // reverse first k ele
        l =0;
        r = (k-1)%size;
        reverse(nums,l,r);

        // reverse k to len ele
        l=k%size;
        r=nums.length-1;
        reverse(nums,l,r);

    }
    public void reverse(int[] nums,int l,int r){
        // System.out.println("left : "+l+" right : "+r);
        while(l < r ){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}