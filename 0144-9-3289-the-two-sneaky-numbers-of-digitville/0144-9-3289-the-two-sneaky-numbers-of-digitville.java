class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] result = new int[2];
        int index = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) == 2) {
                result[index++] = num;
            }
        }

        return result;
    }
}
