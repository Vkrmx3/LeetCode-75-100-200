class Day115_981_TimeBasedKeyValueStore {
    private Map<String,TreeMap<Integer, String>> map = new HashMap<>();

    public Day115_981_TimeBasedKeyValueStore() {
        
    }
    
    public void set(String key, String value, int timestamp) {
		TreeMap<Integer, String> inner = map.getOrDefault(key, new TreeMap());
		inner.put(timestamp, value);
		map.put(key,inner);
	}

	public String get(String key, int timestamp) {
		TreeMap<Integer, String> inner=map.get(key);
        if(inner!=null)
        {
		Integer time=inner.floorKey(timestamp);
		if(time!=null)
			return inner.get(time);
        }
		return "";
	}
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */