package Arrays;

public class Reverse_01 {
    public static void main(String[] args) {

        //Array Reverse
        int[] arr = {7,6,5,4,3,2,1};
        reverseArray(arr);
        System.out.println("Reverse of An Array");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        //String Reverse
        String s = "Hello world";
        String res = reverseString(s);
        System.out.println("\nReverse of a String");
        System.out.println(res);
    }

    public static void reverseArray(int[] arr){
        int n = arr.length;
//        int l = 0 ;
//        int r = n-1;
//        while(l < r){
//            int temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }
        for(int i = 0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

    }

    public static String reverseString(String s){
//        char[] str = s.toCharArray();
//        int l =0 , r = str.length - 1;
//
//        while(l < r){
//            char temp = str[l];
//            str[l] = str[r];
//            str[r] = temp;
//            l++;
//            r--;
//        }
//        return new String(str);
        StringBuilder str= new StringBuilder();
        for(int i = s.length()-1 ; i>=0 ; i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
