
package Arrays;

import java.util.Arrays;

public class MinimizeHeightDif_09 {
    public static void main(String[] args) {
        int[] heights = {12, 6, 4, 15, 17, 10};
        int k = 6;
        int result = minimizeDifference(heights, k);
        System.out.println("Minimum difference: " + result);
    }

    static int minimizeDifference(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];
        int min = arr[0] + k;
        int max = arr[n - 1] - k;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)
                continue;
            int minH = Math.min(min, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, max);
            res = Math.min(res, maxH - minH);
        }
        return res;
    }
}
