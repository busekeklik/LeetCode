class Solution {
    public int search(int[] nums, int target) {
        int s= 0;
        int f = nums.length -1;
        while(s <= f){
            int mid = s + (f-s) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                f = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
       return -1;
    }
}