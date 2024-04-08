public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustsOthersCount = new int[N];
        int[] trustedByCount = new int[N];
        
        for (int[] relation : trust) {
            int a = relation[0] - 1;
            int b = relation[1] - 1;
            trustsOthersCount[a]++;
            trustedByCount[b]++;
        }
        for (int i = 0; i < N; i++) {
            if (trustsOthersCount[i] == 0 && trustedByCount[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}