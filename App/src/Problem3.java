import java.util.*;

class DNSEntry {
    String ip;
    long expiryTime;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiryTime = System.currentTimeMillis() + ttl;
    }
}

public class Problem3 {

    HashMap<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {

        if (cache.containsKey(domain)) {

            DNSEntry entry = cache.get(domain);

            if (System.currentTimeMillis() < entry.expiryTime)
                return entry.ip;

            cache.remove(domain);
        }

        String ip = "172.217.14.206";

        cache.put(domain, new DNSEntry(ip, 300000));

        return ip;
    }

    public static void main(String[] args) {

        Problem3 dns = new Problem3();

        System.out.println(dns.resolve("google.com"));
        System.out.println(dns.resolve("google.com"));
    }
}
