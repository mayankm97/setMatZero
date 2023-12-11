package setZeroesMat;

public class makeZeroMoreOpt1 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 1}, {1, 0, 1, 5}};
        //int[][] arr = {{1,1,1,1}, {1,0,1,1}, {1,1,0,1}, {0,1,1,1}};
        int rows = arr.length, cols = arr[0].length;
        int[] c = new int[arr[0].length];
        c[0] = -1;
        int[] r = new int[arr.length];
        // setting c array values
        for (int i = 1; i < cols; i++)
            c[i] = arr[0][i];
        // setting r array values
        for (int i = 0; i < rows; i++)
            r[i] = arr[i][0];
        // check if r row has 0, if yes, mark that box -2
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (arr[i][j] != 0 && arr[i-1][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j+1] == -2 || arr[j+1][i] == -2 && arr[i+1][j+1] != 0) {
                    arr[i+1][j+1] = 0;
                }
            }
        }
        for (int i = 0; i < cols; i++) {

        }
        
    }
}
