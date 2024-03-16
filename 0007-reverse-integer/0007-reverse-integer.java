class Solution {
    public int reverse(int x) {
        long rev = 0;
        int num = x;
        if (x < 0)
            num *= -1;
        while(num > 0){
            int a = num%10;
            rev = (rev*10)+a;
            num = num/10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            rev*=-1;
        }
        return(int)rev;
    }
}