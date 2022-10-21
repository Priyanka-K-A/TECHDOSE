//2438. Range Product Queries of Powers
class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Long> list = new ArrayList<>();
        for(long i=1;i<=n;i<<=1)
        {
            if((n & i)>0)
                list.add(i);
        }
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            arr[i] = 1;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                arr[i] = (int)(arr[i]*list.get(j)%1000000007);
            }
        }
        return arr;
        
    }
}
