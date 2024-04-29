class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         Set<Integer> lengths = new HashSet<>();

        lengths.add(distSquare(p1, p2));
        lengths.add(distSquare(p1, p3));
        lengths.add(distSquare(p1, p4));
        lengths.add(distSquare(p2, p3));
        lengths.add(distSquare(p2, p4));
        lengths.add(distSquare(p3, p4));

        return lengths.size() == 2 && !lengths.contains(0);
    }

    private static int distSquare(int[] p1, int[] p2) {
        return (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);
    }
}