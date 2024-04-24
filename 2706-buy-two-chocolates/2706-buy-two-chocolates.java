class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int neg = money;
        for(int i = 0; i < 2; i++){
            if((neg -= prices[i]) < 0){
                return money;
            }
        }
        return neg;
    }
}