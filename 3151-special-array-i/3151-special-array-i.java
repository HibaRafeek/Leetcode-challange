class Solution {
    public boolean isArraySpecial(int[] nums) {
        int l=nums.length;
        boolean ans=true;
        for(int i=0;i<l-1;i++){
            if(nums[i]%2==nums[i+1]%2){
                ans=false;
            }        }
        return ans;
    }
}