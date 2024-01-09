package SystemDesign.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private final LinkedHashMap<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    public synchronized V get(K key) {
        return cache.getOrDefault(key, null);
    }

    public synchronized void put(K key, V value) {
        cache.put(key, value);
    }

    public synchronized void remove(K key) {
        cache.remove(key);
    }

    public synchronized void clear() {
        cache.clear();
    }

    public static void main(String[] args) {
        int cacheSize = 5; // Change this to the desired cache size
        LRUCache<String, String> cache = new LRUCache<>(cacheSize);

        // Inserting values into the cache
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        cache.put("key4", "value4");
        cache.put("key5", "value5");

        // Fetching values from the cache
        System.out.println(cache.get("key3")); // Will print value3

        // Inserting a new value, which will trigger the LRU eviction policy
        cache.put("key6", "value6");

        // Fetching a value that was least recently used
        System.out.println(cache.get("key1")); // Will print null (evicted)

        // Removing a key from the cache
//        cache.remove("key4");

        // Clearing the cache
//        cache.clear();
    }
}

