package Arrays;

public class Sort012_04 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2, 1, 0, 2};
        sortArr(arr);
        System.out.println("Sort an Array of 0s, 1s, and 2s");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortArr(int[] arr){
        int low = 0 , mid = 0 , high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr , low , mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr , mid , high);
                high--;
            }
        }
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
