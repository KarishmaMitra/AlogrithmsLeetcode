package problemSolving;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int target = 1;
        int[] arr = new int[] {4, 5, 6, 7, 0, 1, 2};

        int res = searchElement(arr, target);

        System.out.print(res);
    }

    public static int searchElement(int[] arr, int target) {
        if (arr.length==0 || arr==null) return -1;
        int mid, start=0, end=arr.length-1;

        while (start<=end) {
            mid = (end-start)/2 + start;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[start]<=arr[mid]) {
                if (arr[mid]>target && arr[start]<=target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if (arr[mid]<target && arr[end]>=target) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
