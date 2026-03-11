import java.util.*;

public class Problem9 {

    public static void findTwoSum(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(target - num)) {

                System.out.println("Pair found: "
                        + num + " + " + (target - num));
                return;
            }

            set.add(num);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] transactions = {500, 300, 200};

        findTwoSum(transactions, 500);
    }
}
