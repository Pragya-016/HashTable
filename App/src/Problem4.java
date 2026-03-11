import java.util.*;

public class Problem4 {

    HashMap<String, Set<String>> index = new HashMap<>();

    public List<String> generateNgrams(String text, int n) {

        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= words.length - n; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++)
                sb.append(words[i + j]).append(" ");

            list.add(sb.toString().trim());
        }

        return list;
    }

    public void addDocument(String docId, String text) {

        List<String> grams = generateNgrams(text, 5);

        for (String g : grams) {

            index.putIfAbsent(g, new HashSet<>());
            index.get(g).add(docId);
        }
    }

    public static void main(String[] args) {

        Problem4 pd = new Problem4();

        pd.addDocument("essay1",
                "data structures and algorithms are very important");

        System.out.println("Document indexed");
    }
}
