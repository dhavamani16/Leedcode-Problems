package Graph;

public class dfs {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        dfsTraversal(adj, visited, 0);
    }

    public static void dfsTraversal(List<List<Integer>> adj, boolean[] visited, int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbor : adj.get(start)) {
            if (!visited[neighbor]) {
                dfsTraversal(adj, visited, neighbor);
            }
        }
    }
}