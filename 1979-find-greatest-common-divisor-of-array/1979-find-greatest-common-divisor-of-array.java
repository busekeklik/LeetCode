class Solution {
    public int findGCD(int[] nums) {
        int min = 1000;
        int max = 1;
        int temp;
        
        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        if(a == 0)
            return b;
        return gcd(b%a,a);
    }
}