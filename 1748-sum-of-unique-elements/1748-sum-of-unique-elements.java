class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int b = 0;
            for(int j = 0 ;j < nums.length ; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] == nums[j]){
                    b++;
                }
            }
            if(b == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
}