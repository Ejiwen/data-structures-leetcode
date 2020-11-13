package easy.leetcode;
import java.util.*;


public class App {

    public static int[] targetValue(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int k = target - arr[i];
            if(map.containsKey(k)){
                int[] a = {map.get(k),i};
                return a;
            } else {
                map.put(arr[i],i);
            }
        }
        int[] b = {-1,-1};
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7};

        System.out.println(targetValue(arr,8)[0] +"-----"+targetValue(arr,8)[1]);
    }
}