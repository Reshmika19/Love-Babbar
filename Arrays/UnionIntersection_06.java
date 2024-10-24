package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection_06 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        int[] union = findUnion(arr1, arr2);
        int[] intersection = findIntersection(arr1, arr2);

        System.out.print("Union: ");
        printArray(union);
        System.out.print("\nIntersection: ");
        printArray(intersection);
    }

    public static int[] findUnion(int[] arr1 , int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1) set.add(i);
        for(int i : arr2) set.add(i);
        return convertIntoArr(set);
    }

    public static int[] findIntersection(int[] arr1 , int[] arr2){
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i : arr1) set.add(i);
        for(int i : arr2){
            if(set.contains(i)) res.add(i);
        }
        return convertIntoArr(res);
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static int[] convertIntoArr(Set<Integer> set){
        int n = set.size();
        int[] arr = new int[n];
        int i = 0;
        for(int num : set){
            arr[i++] = num;
        }
        return arr;
    }
}
