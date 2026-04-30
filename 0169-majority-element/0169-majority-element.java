class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            int freq=0;
            for(int j=0;j<l;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
            }
            if(freq>l/2){
               return nums[i];
            }
        }
        return -1;
    }
}