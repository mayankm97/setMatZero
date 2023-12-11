package setZeroesMat;

import java.util.Arrays;

public class makeZeroes1 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 1}, {1, 0, 1, 5}};
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < rows; k++) {
                        if (arr[k][j] != 0) arr[k][j] = -1;
                    }
                    for (int k = 0; k < cols; k++) {
                        if (arr[i][k] != 0) arr[i][k] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == -1) arr[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
