import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int j = 0;

        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[j++] = X[i];
            }
        }

        int i = j - 1;
        j = n - 1;
        int k = m - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }

        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 11, 8, 9, 10, 15 };
        Arrays.sort(Y);
        System.out.println("Input X: " + Arrays.toString(X));
        System.out.println("Input Y: " + Arrays.toString(Y));

        mergeArrays(X, Y);

        System.out.println("Output X: " + Arrays.toString(X));
    }
}
