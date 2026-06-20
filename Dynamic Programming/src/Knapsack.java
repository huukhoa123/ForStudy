public class Knapsack {

    public static void main(String[] args) {

        int n = 4;
        int s = 6;

        int[] w = {0, 2, 1, 4, 3};
        int[] v = {0, 3, 3, 4, 2};
        int[][] dp = new int[100][100];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {

                dp[i][j] = dp[i - 1][j];

                if (w[i] <= j) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[n][s]);
    }
}
