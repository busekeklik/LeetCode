class Solution {
    public int minimumSum(int num) {
        int numbers[] = new int[4];
        int sum = 0;
        for (int i = 0; num > 0; i++)
        {
            numbers[i] = num % 10;
            num /= 10;
        }
        
        Arrays.sort(numbers);
        
        int val1 = numbers[0] * 10 + numbers[2];
        int val2 = numbers[1] * 10 + numbers[3];     
        
        sum = val1 + val2;
        return sum;
        
    }
}