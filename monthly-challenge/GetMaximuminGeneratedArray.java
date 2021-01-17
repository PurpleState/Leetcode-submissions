/**You are given an integer n. An array nums of length n + 1 is generated in the following way:

nums[0] = 0
nums[1] = 1
nums[2 * i] = nums[i] when 2 <= 2 * i <= n
nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
Return the maximum integer in the array nums​​​.**/

class Solution {
    int[] GEN_arr;
    public int getMaximumGenerated(int n) {
        GEN_arr = new int[n+1];
        if(n<2) return n;
        int MAX = 1;
        GEN_arr[0] = 0;
        GEN_arr[1] = 1;
        System.out.print(GEN_arr[0]+" "+GEN_arr[1]+" ");
        for(int i=2;i<=n;i++){
            if(i%2==0)
                GEN_arr[i] = GEN_arr[i/2];
            else
                GEN_arr[i] = GEN_arr[i/2] + GEN_arr[i/2+1];
            // System.out.print(GEN_arr[i]+" ");
            MAX = Math.max(GEN_arr[i],MAX);
        }
        // return GEN_arr[n];
        return MAX;
    }
}
