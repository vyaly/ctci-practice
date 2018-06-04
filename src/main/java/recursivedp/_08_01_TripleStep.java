package recursivedp;

/**
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
class _08_01_TripleStep {

    int countWays(int steps) {
        int[] dp = new int[Math.max(4,steps + 1)];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        if(steps < 4) {
            return dp[steps];
        }

        for(int i = 4; i <= steps; i++) {

            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[steps];
    }
}
