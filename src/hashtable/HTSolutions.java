package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HTSolutions {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer, Boolean> myHM = new HashMap<>();

        for (int j : array) {
            if (myHM.get(j) != null) {
                duplicates.add(j);
            } else {
                myHM.put(j, true);
            }
        }

        return duplicates;
    }

    public static Character firstNonRepeatingChar(String input) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] inputChars = input.toCharArray();

        for (char c : inputChars) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : inputChars) {
            if (charCounts.get(c) == 1) return c;
        }

        return null;
    }
}
