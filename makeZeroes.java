package setZeroesMat;

import java.util.Arrays;

public class makeZeroes {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0}, {3,4,5,2}, {1,0,1,5}};
        int rows = arr.length, cols = arr[0].length;
        int[][] arr1 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = -1;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < rows; k++) {
                        arr1[k][j] = 0;
                    }
                    for (int k = 0; k < cols; k++) {
                        arr1[i][k] = 0;
                    }
                    //i++; j = 0;
                    if (i == rows) break;
                }
                else if (arr[i][j] != 0 && arr1[i][j] != 0) {
                    arr1[i][j] = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr1));
    }
}
