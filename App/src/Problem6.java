import java.util.*;

class TokenBucket {
    int tokens;

    TokenBucket(int max) {
        tokens = max;
    }
}

public class Problem6 {

    HashMap<String, TokenBucket> clients = new HashMap<>();
    int LIMIT = 5;

    public boolean checkRateLimit(String clientId) {

        clients.putIfAbsent(clientId, new TokenBucket(LIMIT));

        TokenBucket bucket = clients.get(clientId);

        if (bucket.tokens > 0) {

            bucket.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Problem6 limiter = new Problem6();

        for (int i = 0; i < 7; i++)
            System.out.println(limiter.checkRateLimit("client1"));
    }
}
