package Arrays;

import java.util.PriorityQueue;

public class kthMinandMax_03 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int kthMin = FindkthMin(arr , k);
        int kthMax = FindkthMax(arr , k);
        System.out.println("Kth Min Element : " + kthMin);
        System.out.println("Kth Max Element : " + kthMax);
    }

    public static int FindkthMin(int[] arr , int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : arr){
            minHeap.add(i);
        }
        for(int i = 1 ; i<k ; i++){
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static int FindkthMax(int[] arr , int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i : arr){
            maxHeap.add(i);
        }
        for(int i = 1 ; i<k ; i++){
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
