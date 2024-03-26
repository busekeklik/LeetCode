class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == target){
                res[0] = i;
                res[1] = i;
                break; 
            }
        }
        for(; i < nums.length-1; i++){
            if(nums[i] == nums[i+1])
                res[1] = i+1;
            else
             break;
    }
    return res;
    }
    
}