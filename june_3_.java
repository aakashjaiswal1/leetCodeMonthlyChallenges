class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(o -> o[0] - o[1]));
        int sum = 0;
        for (int i = 0; i < costs.length; ++i) {
            if (i < costs.length / 2) sum += costs[i][0];
            else sum += costs[i][1];
        }
        return sum;
    }
}
