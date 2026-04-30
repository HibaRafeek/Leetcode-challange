class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evensum=evensum+i;
            }
            else{
                oddsum=oddsum+i;
            }
        }
        int gcd=1;
        for(int i=1;i<=evensum && i<oddsum;i++){
            if(evensum%i==0 && oddsum%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}