class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int pair = -1;
        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                pair = Math.max(pair, num);
            }
        }
        return pair;
    }
}