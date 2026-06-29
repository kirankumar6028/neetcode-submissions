class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int productOfAllBeforeCurrent = 1;
        int productOfAllAfterCurrent = 1;

        for(int i=0; i<n; i++){
            res[i] = productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= nums[i];
        }

        for(int j=n-1; j>=0; j--){
            res[j] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= nums[j];
        }
        return res;
    }
}  
