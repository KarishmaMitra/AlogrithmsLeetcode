package problemSolving;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new
 * length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) 
 * extra memory.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = new int[] {1,1,2,3,5,7,7,8,9};
        int newLen = removeDuplicates(arr);

        System.out.print(newLen);

    }

    public static int removeDuplicates(int[] arr) {
        int j = 1;

        for (int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
