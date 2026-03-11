import java.util.*;

public class Problem5 {

    HashMap<String, Integer> pageViews = new HashMap<>();

    public void recordVisit(String url) {
        pageViews.put(url, pageViews.getOrDefault(url, 0) + 1);
    }

    public void showStats() {
        System.out.println(pageViews);
    }

    public static void main(String[] args) {

        Problem5 analytics = new Problem5();

        analytics.recordVisit("/news");
        analytics.recordVisit("/news");
        analytics.recordVisit("/sports");

        analytics.showStats();
    }
}
