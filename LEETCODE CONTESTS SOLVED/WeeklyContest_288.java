// 2231. Largest Number After Digit Swaps by Parity
class Solution {
    public int largestInteger(int num) {
        int len = (Integer.toString(num)).length();
        int[] arr = new int[len];
        for(int i=len-1;i>=0;i--)
        {
            arr[i] = num%10;
            num/=10;
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[j]>arr[i]&&((arr[i]%2==0 && arr[j]%2==0)||(arr[i]%2!=0 && arr[j]%2!=0)))
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int sum=0,sq=1;
        for(int i=len-1;i>=0;i--)
        {
            sum+=arr[i]*sq;
            sq*=10;
        }
        return sum;
        
    }
}
