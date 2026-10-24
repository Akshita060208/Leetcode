class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int oneStepBefore = 2; // ways to reach step 2
        int twoStepsBefore = 1; // ways to reach step 1

        for (int step = 3; step <= n; step++) {
            int ways = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = ways;
        }

        return oneStepBefore;
    }
}