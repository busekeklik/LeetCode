class Solution {
    public int[] twoSum(int[] nums, int target) {
    
         int[] result = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                if( (j!= i) && ((nums[j]+nums[i])==target))
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}