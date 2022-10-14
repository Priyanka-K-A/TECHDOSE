//2164. Sort Even and Odd Indices Independently
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int[] arr = new int[len];
        int k=0,l=0;
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                arr[i] = even.get(k);k++;                
            }
            else 
            {
                arr[i] = odd.get(l);l++;
            }
        }
        return arr;        
    }
}
