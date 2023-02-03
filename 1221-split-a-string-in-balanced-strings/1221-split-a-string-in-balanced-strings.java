class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') sum1++;
            if(s.charAt(i)=='L') sum2++;
            if(sum1==sum2){
                count++;
                sum1=0;
                sum2=0;
            }
        }return count;
    }
}