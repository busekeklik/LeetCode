class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int sorted[] = new int[points.length];
        int diff = 0;
        for(int i = 0; i< points.length; i++){
            sorted[i] = points[i][0];
        }
        Arrays.sort(sorted);
        for(int i = 0; i < sorted.length - 1; i++){
            if((sorted[i+1] - sorted[i]) > diff)
                diff = sorted[i+1] - sorted[i];
        }
        return diff;
    }
}