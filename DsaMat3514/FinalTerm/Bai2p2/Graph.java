package DsaMat3514.FinalTerm.Bai2p2;

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

    // Phuong thuc kiem tra xem do thi co chu trinh hay khong
    public boolean hasCycle() {
        return false;
    }
}
