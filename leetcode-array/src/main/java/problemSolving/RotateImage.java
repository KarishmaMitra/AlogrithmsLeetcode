package problemSolving;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 */
public class RotateImage {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        rotate(arr);

        System.out.print("----Result----");

        for (int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr) {
        int r=arr.length, c=arr[0].length;
        if (arr==null || r==0 || c==0) return;

        for (int i=0; i<r/2; i++) {
            for (int j=0; j<c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[r-i-1][j];
                arr[r-i-1][j] = temp;
            }
        }

        for (int i=0; i<r; i++) {
            for (int j=i; j<c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
