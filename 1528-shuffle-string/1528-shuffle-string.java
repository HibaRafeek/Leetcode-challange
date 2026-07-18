class Solution {
    public String restoreString(String s, int[] indices) {
        char[] a=s.toCharArray();
        int l=a.length;
        char[] ans=new char[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i==indices[j]){
                    ans[i]=a[j];
                }
            }
        }
        return new String(ans);
    }
}