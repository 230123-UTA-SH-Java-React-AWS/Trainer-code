import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Solution.Solution;

public class App {
    public static int findMaxProfit(int[] stockPrices)
    {
        return 0;
    }
    public static void main(String[] args) throws Exception {
        Map<int[], Integer> testcases = new HashMap<>();

        testcases.put(new int[]{7, 1, 5, 3, 6, 4}, 7);
        testcases.put(new int[]{7, 6, 4, 3, 1}, 0);
        testcases.put(new int[]{1, 2, 3, 4, 5}, 4);
        testcases.put(new int[]{4, 7, 10, 3, 1}, 6);
        testcases.put(new int[]{1, 5}, 4);
        testcases.put(new int[]{1}, 0);
        testcases.put(new int[]{4, 10, 3}, 6);
        testcases.put(new int[]{1, 1, 1, 1, 1}, 0);
        testcases.put(new int[]{8, 5, 7, 8, 10, 10, 9, 8, 3, 1, 2, 6, 2, 8, 1, 7, 10, 9, 5, 2}, 25);
        

        for (Entry<int[], Integer> elemeEntry : testcases.entrySet()) {
            System.out.println(Arrays.toString(elemeEntry.getKey()));

            int actual =  Solution.findMaxProfit(elemeEntry.getKey());

            if (actual == elemeEntry.getValue()) {
                System.out.println("\u001B[32m"+"Correct"+"\u001B[0m");
                System.out.println("max profit is " + elemeEntry.getValue());
            }else {
                System.out.println("\u001B[31m"+"Failed"+"\u001B[0m");
                System.out.println("Your method gave: " + actual);
                System.out.println("Expected output: " + elemeEntry.getValue());
            }
            
            System.out.println("===============================");
        }

    }
}
