class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> divisible = new ArrayList<>();
        for(int i = left; i <= right; i++)
        {
            int n = i;
            int count = 0;
            while(n > 0){
                int dv = n % 10;
                if(dv == 0){
                    count = 0;
                    break;
                }
                else if(i % dv == 0){
                    count++;
                    n = n / 10;
                }
                else{
                    count = 0;
                    break;
                }
                
            }
            if(count > 0){
                divisible.add(i);
            }
        }
        return divisible;
    }
}