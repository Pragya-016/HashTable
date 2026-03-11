import java.util.*;

public class Problem7 {

    HashMap<String, Integer> queries = new HashMap<>();

    public void addQuery(String q) {
        queries.put(q, queries.getOrDefault(q, 0) + 1);
    }

    public void search(String prefix) {

        queries.entrySet()
                .stream()
                .filter(e -> e.getKey().startsWith(prefix))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        Problem7 ac = new Problem7();

        ac.addQuery("java tutorial");
        ac.addQuery("javascript");
        ac.addQuery("java download");

        ac.search("jav");
    }
}