import java.util.*;

public class Problem2 {

    HashMap<String, Integer> stock = new HashMap<>();
    LinkedHashMap<Integer, String> waitingList = new LinkedHashMap<>();

    public synchronized String purchaseItem(String productId, int userId) {

        int available = stock.getOrDefault(productId, 0);

        if (available > 0) {

            stock.put(productId, available - 1);
            return "Success. Remaining: " + (available - 1);

        } else {

            waitingList.put(userId, productId);
            return "Added to waiting list position #" + waitingList.size();
        }
    }

    public static void main(String[] args) {

        Problem2 sale = new Problem2();

        sale.stock.put("IPHONE15", 2);

        System.out.println(sale.purchaseItem("IPHONE15", 101));
        System.out.println(sale.purchaseItem("IPHONE15", 102));
        System.out.println(sale.purchaseItem("IPHONE15", 103));
    }
}
