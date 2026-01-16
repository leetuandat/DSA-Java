package DsaMat3514.FinalTerm.Bai1p2;

import java.util.*;
@SuppressWarnings({"unchecked", "deprecation"})
class Graph{
    private List<List<Integer>> adj;
    private boolean[] visited;
    private int n;

    public Graph(int n) {
        this.n = n;
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new boolean[n];
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); 
    }

    // Phuong thuc dem so thanh phan lien thong trong do thi
    public int countConnectedComponents() {
        int count = 0;
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int vertex) {
        visited[vertex] = true;
        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
