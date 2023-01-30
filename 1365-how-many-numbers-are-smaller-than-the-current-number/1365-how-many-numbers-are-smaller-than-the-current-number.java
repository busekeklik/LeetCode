class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int len = nums.length;
        int [] nums2 = new int[len];
        for(int i = 0; i < len; i++)
        {
            count = 0;
            for(int j = 0; j < len; j++)
            {
                if(nums[i] > nums[j])
                    count++;
            }
            nums2[i] = count;
        }
        return nums2;
    }
}