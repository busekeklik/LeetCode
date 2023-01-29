class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int result;
        while(n > 0)
        {
            result = n%10;
            sum += result;
            product *= result;
            n /= 10;
        }
        result = product - sum;
        return result;
    }
}