class Solution {
    public int heightChecker(int[] heights) {
        int sorted[] = new int[heights.length];
        int count = 0;
        
        for(int i=0;i<sorted.length;i++)
        {
            sorted[i] = heights[i];
        }
        
        Arrays.sort(sorted);
        
        for(int i = 0; i < sorted.length; i++)
        {
            if(sorted[i] != heights[i])
                count++;
        }
        return count;
    }
}