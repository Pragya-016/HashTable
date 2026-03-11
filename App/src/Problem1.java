import java.util.*;

public class Problem1 {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username) {

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        return !users.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {

        List<String> suggestions = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            suggestions.add(username + i);
        }

        suggestions.add(username.replace("_", "."));

        return suggestions;
    }

    public void register(String username, int userId) {
        users.put(username, userId);
    }

    public String getMostAttempted() {

        return attempts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public static void main(String[] args) {

        Problem1 system = new Problem1();

        system.register("john_doe", 1);

        System.out.println(system.checkAvailability("john_doe"));
        System.out.println(system.checkAvailability("jane_smith"));

        System.out.println(system.suggestAlternatives("john_doe"));
    }
}