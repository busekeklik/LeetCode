class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<Integer>();
        for(int num : nums)
            unique.add(num);
        return unique.size() != nums.length;
    }
}