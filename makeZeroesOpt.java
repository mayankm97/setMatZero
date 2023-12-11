package setZeroesMat;

import java.util.Arrays;

public class makeZeroesOpt {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 2, 0}, {3, 4, 5, 1}, {1, 0, 1, 5}};
        int rows = arr.length, cols = arr[0].length;
        int[] r = new int[arr.length];
        int[] c = new int[arr[0].length];

        Arrays.fill(r, -1);
        Arrays.fill(c, -1);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 0 || r[i] == 0 && arr[i][j] != 0) {
                        arr[i][j] = 0;

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
