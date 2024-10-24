package Arrays;

public class Min_Max_02 {
    public static void main(String[] args) {
        int arr[] = {4,3,9,2,6,8};
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]<min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum Element : " + min);
        System.out.println("Maximum Element : " + max);
    }
}
