import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        for (String key : map.keySet()) {
            System.out.println(key + " is " + map.get(key) + " years old.");
        }
    }
}
