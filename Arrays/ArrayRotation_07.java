package Arrays;

public class ArrayRotation_07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = -3;
        rotate(arr, k);
        System.out.print("Rotated Array  :");
        printArray(arr);
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        k = 2;
        rotate(arr2, k);
        System.out.print("\nRotated Array: ");
        printArray(arr2);
    }
    public static void rotate(int[] arr , int k){
        int n = arr.length;
        k = k % n;
        if (k<0){
            k += n;
        }
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);
        reverse(arr , 0 , n-1);
    }
    public static void reverse(int[] arr , int l , int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

//E:\Java\LoveBabbar\src\Arrays\ArrayRotation_07.java
