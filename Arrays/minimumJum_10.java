package Arrays;

public class minimumJum_10 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int result = minJumps(arr);
        System.out.println("Minimum jumps: " + result);
    }
    public static int minJumps(int[] arr){
        if(arr.length == 0 || arr[0] == 0){
            return -1;
        }
        int jumps = 0 , farthest = 0 , currentEnd = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            farthest = Math.max(farthest , i + arr[i]);
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
            if(currentEnd >= arr.length - 1){
                break;
            }
        }
        return jumps;
    }
}



