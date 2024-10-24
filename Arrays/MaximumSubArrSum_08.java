package Arrays;

public class MaximumSubArrSum_08 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maximumSubArray(arr);
        System.out.println(res);
    }
    public static int maximumSubArray(int[] arr){
        int max = Integer.MIN_VALUE , curSum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            int temp = curSum + arr[i];
            if(temp < arr[i]) curSum = arr[i];
            else curSum = temp;
            if(max < curSum) max = curSum;
        }
        return max;
    }
}

