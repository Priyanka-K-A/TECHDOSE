//2424. Longest Uploaded Prefix

class LUPrefix {
    boolean[] res;
    int count=0;
    public LUPrefix(int n) {
        res = new boolean[n+1];
    }
    public void upload(int video) {
        res[video-1] = true;
    }
    public int longest() {
        while(res[count]==true)
            ++count;
        return count;
    }
}
