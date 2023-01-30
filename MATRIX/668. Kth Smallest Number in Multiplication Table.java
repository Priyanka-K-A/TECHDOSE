class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l=1,r=m*n,ans=r;
        int count=0;
        while(l<=r) 
        {
            int mid = l+(r-l)/2;
            count=0;
            for(int i=1;i<=m;i++) 
            {
                count+=Math.min(n,mid/i);
            }
            if(count>=k) 
            {
                ans=mid;
                r=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        return ans;
    }
}
