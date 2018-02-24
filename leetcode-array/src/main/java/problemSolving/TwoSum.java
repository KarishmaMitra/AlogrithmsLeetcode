package problemSolving;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {

    public static void main(String args) {
        int[] arr = {5,8,9,2};
        int target = 7;
        int[] res = twoSum(arr, target);

        for (int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            if(map.containsKey(target-arr[i])) {
                res[0] = map.get(target-arr[i]);
                res[1] =i;
            }
            map.put(arr[i], i);
        }
        return res;
    }

}
