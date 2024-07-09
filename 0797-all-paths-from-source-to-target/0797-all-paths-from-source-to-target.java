class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        currentPath.add(0);
        dfs(0, graph, currentPath, paths);
        return paths;
    }

    private void dfs(int node, int[][] graph, List<Integer> currentPath, List<List<Integer>> paths) {
        if (node == graph.length - 1) {
            paths.add(new ArrayList<>(currentPath));
            return;
        }
        for (int nextNode : graph[node]) {
            currentPath.add(nextNode);
            dfs(nextNode, graph, currentPath, paths);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}