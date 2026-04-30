class Solution {
    public int[] transformArray(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        for(int j=0;j<l;j++){
            for(int i=0;i<l-1;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
        return nums;
    }
}