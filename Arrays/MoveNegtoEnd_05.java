package Arrays;

public class MoveNegtoEnd_05 {
    public static void main(String[] args) {
        int[] arr = {12, -7, 5, -3, 8, -2};
        moveNegativeNumbers(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void moveNegativeNumbers(int[] arr){
        int j = 0;
        for(int i = 0;i<arr.length ; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

