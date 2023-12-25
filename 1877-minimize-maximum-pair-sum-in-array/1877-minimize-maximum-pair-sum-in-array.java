class Solution {
  public int minPairSum(int[] nums) {

    Arrays.sort(nums);

    var max = 0;
    var n = nums.length;

    for (var i = 0; i < n/2; i++)
      max = Math.max(max, nums[i] + nums[n-i-1]);

    return max;
  }
}