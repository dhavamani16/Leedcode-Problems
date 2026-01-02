public class largestElementInArray {
    class Solution {

    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int n = arr1.length;
        int max = Solution.findLargestElement(arr1, n);
        System.out.println("The largest element in the array is: " + max);

        int[] arr2 = {8, 10, 5, 7, 9};
        n = arr2.length;
        max = Solution.findLargestElement(arr2, n);
        System.out.println("The largest element in the array is: " + max);
    }
}

}
