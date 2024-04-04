import java.util.Arrays;

public class mergetwoarrat {

    public static void mergeArrays(int X[], int Y[]) {

        int m = X.length;
        int n = Y.length;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                if (X[j] == 0) {
                    X[j] = Y[i];
                    i++;
                    j++;
                } else {

                    continue;

                }

            }

        }

    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 5, 8, 9, 10, 15 };

        System.out.println("Input X: " + Arrays.toString(X));
        System.out.println("Input Y: " + Arrays.toString(Y));

        mergeArrays(X, Y);

        System.out.println("Output X: " + Arrays.toString(X));
    }
}
