//2336. Smallest Number in Infinite Set
class SmallestInfiniteSet {
    List<Integer> list = new ArrayList<>();
    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++)
            list.add(i);        
    }
    
    public int popSmallest() {
        int a = list.get(0);
        list.remove(list.get(0));
        return a;
    }
    
    public void addBack(int num) {
        if(!list.contains(num))
            list.add(num);
        
        Collections.sort(list);
    }
}
