class Solution {
    public int mirrorDistance(int n) {
        int dup=n;
        int rev=0;
        int ans=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        ans=dup-rev;
        if(ans<0){
            ans*=-1;
        }
        return ans;
    }
}