class Pair<K, V> {
    private K key;    
    private V value;  
   
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
 
    public K getKey() {
        return key;
    }
 
    public V getValue() {
        return value;
    }
}

public class generic_multiple {
    public static void main(String[] args) {
       
        Pair<String, Integer> pair1 = new Pair<>("Age", 30);
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
 
        Pair<Integer, String> pair2 = new Pair<>(101, "Employee ID");
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}
