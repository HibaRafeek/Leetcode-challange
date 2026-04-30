class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int l=nums.length;
        if(l%2==0){
            for(int i=0;i<l;i++){
                int freq=0;
                for(int j=0;j<l;j++){
                    if(nums[i]==nums[j]){
                        freq++;
                    }
                }
                if(freq>2){
                  return false;
                }
            }
        }
        return true;
    }
}