class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int [] finalArray = new int[nums.length];

        int j = 0;
        int k = n;
        int i = 0;
        while(j <= k && k < nums.length){
            finalArray[i] = nums[j];
            finalArray[i+1] = nums[k];
            i+=2;
            j++;
            k++;
        }
        return finalArray;

    }
}