class LRUCache {
    public ArrayList<int[]> cache;
    public int capacity;

    public LRUCache(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0]==key){
                int[] tmp = cache.remove(i);
                cache.add(tmp);
                return tmp[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0] == key){
                int[] temp = cache.remove(i);
                temp[1] = value;
                cache.add(temp);
                return;
            }
        }
        if(cache.size()==capacity){
            cache.remove(cache.get(0));
        }
        cache.add(new int[]{key,value});
    }
}
