class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int res[] = new int[len];
        int index = 0;
    
        for (int i = 0; i < len; i++)
        {
            int count = 0;
            Set<Integer> set = new HashSet<>();

            for(int j = 0; j <= i; j++) {
                set.add(A[j]);
            }
            
            for(int k = 0; k <= i; k++) {
                if(!set.add(B[k])) {
                    count++;
                }
            }
            res[index++] = count;
        }
        return res;
    }
}