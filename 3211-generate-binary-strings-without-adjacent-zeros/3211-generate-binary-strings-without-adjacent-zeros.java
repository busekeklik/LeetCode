class Solution {
    public List<String> validStrings(int n) {
        List<String> results = new ArrayList<>();
        if (n <= 0) {
            return results;
        }
        generate("1", n, results);
        generate("0", n, results);
        return results;
    }

    private static void generate(String current, int n, List<String> results) {
        if (current.length() == n) {
            results.add(current);
            return;
        }
        generate(current + "1", n, results);
        if (current.endsWith("1")) {
            generate(current + "0", n, results);
        }
    }
}