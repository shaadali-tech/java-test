import java.util.*;

public class JsonCompare {
    public static void main(String[] args) {
        Map<String, Object> json1 = new HashMap<>();
        json1.put("browser", "Chrome");
        json1.put("version", 100);

        Map<String, Object> json2 = new HashMap<>();
        json2.put("browser", "Chrome");
        json2.put("version", 101);

        for (String key : json1.keySet()) {
            if (!json1.get(key).equals(json2.get(key))) {
                System.out.println("Difference at " + key + ": " +
                    json1.get(key) + " vs " + json2.get(key));
            }
        }
    }
}
