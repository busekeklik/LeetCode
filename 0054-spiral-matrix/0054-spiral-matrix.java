class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>seq = new ArrayList<>();
        int l = 0;
        int t = 0;
        int r = matrix[0].length - 1;
        int b = matrix.length - 1;

        while(l <= r && t <= b){
            for (int i = l; i <= r; i++){
                seq.add(matrix[t][i]);
            }
            t++;
            for (int i = t; i <= b; i++){
                seq.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int i = r; i>=l; i--){
                    seq.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i = b; i>=t ; i--){
                    seq.add(matrix[i][l]);
                }
                l++;
            }
        }
        return seq;
    }
}