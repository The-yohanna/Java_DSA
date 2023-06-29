package hashtable;

import java.util.*;

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

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String anagram = String.valueOf(strChar);

            if (!anagramGroups.containsKey(anagram)){
                List<String> anagramGroup = new ArrayList<>();
                anagramGroup.add(str);
                anagramGroups.put(anagram, anagramGroup);
            } else {
                anagramGroups.get(anagram).add(str);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            } else {
                numMap.put(num, i);
            }
        }

        return new int[] {};
    }

    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0,-1); //cumulative sum before the start of the array
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if (sumIndex.containsKey(currentSum - target)) {
                return new int[] {sumIndex.get(currentSum - target) + 1, i};
            } else {
                sumIndex.put(currentSum, i);
            }
        }
        return new int[] {};
    }

    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> mySet = new HashSet<>(myList);
        return new ArrayList<>(mySet);
    }

    public static boolean hasUniqueChars(String string) {
        char[] strChars = string.toCharArray();
        Set<String> uniqueChars = new HashSet<>();
        for (char x : strChars) {
            uniqueChars.add(String.valueOf(x));
        }
        return strChars.length == uniqueChars.size();
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int x : arr1) {
            set.add(x);
        }

        for (int y : arr2) {
            int complement = target - y;
            if (set.contains(complement)) {
                pairs.add(new int[] {complement, y});
            }
        }

        return pairs;
    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
