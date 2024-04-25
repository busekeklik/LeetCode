public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= N; i++) {
            int count = frequencyMap.getOrDefault(i, 0);
            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }
}