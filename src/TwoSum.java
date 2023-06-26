import java.util.Arrays;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[] {arr[left], arr[right]};
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[] { 1, 3, 4, 8, 9 }, 11);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
