class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length - 1;
        for (int[] ints : grid) Arrays.sort(ints);

        int sum = 0;
        while (n >= 0){
            int maxValue = Integer.MIN_VALUE;
            for (int[] ints : grid) {
                int number = ints[n];
                if (number > maxValue)
                    maxValue = number;
            }
            n--;
            sum+=maxValue;
        }
        return sum;
    }
}