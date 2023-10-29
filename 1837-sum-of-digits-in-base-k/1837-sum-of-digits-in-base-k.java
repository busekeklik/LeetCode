class Solution {
    public int sumBase(int n, int k) {
        // n / k +
        
        int last_number = 0;
        
        while(n > 0)
        {
            last_number += n % k;
            n /= k;
        }
        return last_number;
    }
}