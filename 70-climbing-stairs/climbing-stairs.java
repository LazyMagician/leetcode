class Solution {
    public int climbStairs(int n) {

        int first =1, second=1,curr=0;

        if(n <= 1 ) return 1;
        for(int i=2;i<=n;i++){
            curr = first + second;
            first = second;
            second = curr;
        }

        return curr;
    }
}