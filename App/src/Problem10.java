import java.util.*;

public class Problem10 {

    HashMap<String, String> L1 = new HashMap<>();
    HashMap<String, String> L2 = new HashMap<>();
    HashMap<String, String> DB = new HashMap<>();

    public String getData(String key) {

        if (L1.containsKey(key))
            return L1.get(key);

        if (L2.containsKey(key)) {

            L1.put(key, L2.get(key));
            return L2.get(key);
        }

        if (DB.containsKey(key)) {

            L2.put(key, DB.get(key));
            L1.put(key, DB.get(key));
            return DB.get(key);
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        Problem10 cache = new Problem10();

        cache.DB.put("video_123", "MovieData");

        System.out.println(cache.getData("video_123"));
        System.out.println(cache.getData("video_123"));
    }
}
