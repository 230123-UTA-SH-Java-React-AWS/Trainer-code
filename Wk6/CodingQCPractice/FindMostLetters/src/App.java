import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Solution.Solution;

public class App {

    public static String findTheMostOccuringLetters(String[] listOfString)
    {
        return "";
    }
    public static void main(String[] args) throws Exception {
        Map<String[], String> testcases = new HashMap<>();

        testcases.put(new String[]{"employ", "address", "liberal", "twin", "slump", "ton", "entitlement", "ruin", "offense", "normal"}, "e - 8");
        testcases.put(new String[]{"aa", "bb", "cc", "dd", "ee", "ff"}, "a - 2");
        testcases.put(new String[]{"screw", "is", "relinquish", "fragrant", "slump", "fling", "econobox", "mouse", "effort", "effort"}, "e - 6");
        testcases.put(new String[]{"prediction", "prediction", "prediction", "prediction"}, "i - 8");
        testcases.put(new String[]{"hemisphere", "hemisphere", "prediction", "accessible", "tournament", "leadership", "compliance", "understand", "dependence", "memorandum"}, "e - 19");

        long startTime = System.currentTimeMillis();

        for (Entry<String[], String> elemeEntry : testcases.entrySet()) {
            System.out.println(Arrays.toString(elemeEntry.getKey()));

            String actual = findTheMostOccuringLetters(elemeEntry.getKey());

            if (actual.equals(elemeEntry.getValue())) {
                System.out.println("\u001B[32m"+"Correct"+"\u001B[0m");
                System.out.println("most concurrent letter is " + elemeEntry.getValue());
            }else {
                System.out.println("\u001B[31m"+"Failed"+"\u001B[0m");
                System.out.println("Your method gave: " + actual);
                System.out.println("Expected output: " + elemeEntry.getValue());
            }
            
            System.out.println("===============================");
        }

        System.out.println("Time it took to finish " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
