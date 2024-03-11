class Solution {
    public int countDigits(int num) {
        int count = 0;
        int r = 0;
        int res = num;

        while(res > 0){
            r = res%10;
            res /= 10;
            if(num % r == 0){
                count++;
            }
        }
        return count;
    }
}