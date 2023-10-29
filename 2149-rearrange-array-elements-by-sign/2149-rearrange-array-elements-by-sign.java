class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int p = 0;
        int n = 1;

        for(int num : nums) {
            if(num > 0){
                res[p] = num;
                p += 2;
            } else {
                res[n] = num;
                n += 2;
            }
        }

        return res;
    }
}