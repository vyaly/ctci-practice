package recursivedp;

/**
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
class _08_01_TripleStep {
/* Suboptimal because requires O(n) space
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
    */

    /** optimal because uses O(1) space and run time is O(n)
     *
     * @param steps
     * @return
     */
    int countWays(int steps) {
        if(steps == 0) return 1;
        else if(steps == 1) return 1;
        else if(steps == 2) return 2;
        else if(steps == 3) return 4;
        int[] dp = new int[]{1,2,4};

        for(int i = 4; i <= steps; i++) {
            int temp = dp[2];
            dp[2]  +=  dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return dp[2];
    }
}
