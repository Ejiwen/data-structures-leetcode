package easy.leetcode;
import java.util.*;


public class App {

    public static boolean targetValue(int[] arr, int target) {
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int k = target - arr[i];
            if(map.containsKey(k)){
                return true;
            } else {
                map.put(arr[i],true);
            }
            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 6, 7};

        System.out.println(targetValue(arr,8));
    }
}
