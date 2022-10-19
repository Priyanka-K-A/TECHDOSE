//2374. Node With Highest Edge Score
class Solution {
    public int edgeScore(int[] edges) {
        long[] score = new long[edges.length];
        for(int i=0;i<edges.length;i++)
        {
            score[edges[i]]+=i;
        }
        long max = score[0];
        int ind=0;
        for(int i=0;i<edges.length;i++)
        {
            if(score[i]>max)
            {
                max = score[i];
                ind = i;
            }
        }
        return ind;
    }
}
