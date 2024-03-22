class Solution {
    public int kthFactor(int n, int k) {
        int[] nums = new int[k];
        int count = 0; 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nums[count] = i; 
                count++; 
                if (count == k) 
                    return nums[count - 1]; 
            }
        }
        return -1;
    }
}
