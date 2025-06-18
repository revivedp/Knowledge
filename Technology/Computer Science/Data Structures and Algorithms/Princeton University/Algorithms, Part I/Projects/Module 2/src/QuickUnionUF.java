public class QuickUnionUF {
    private int[] parent;

    public QuickUnionUF(int n){
        parent = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }

    public int findRoot(int p){
        while (p != parent[p]){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q){
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if(rootP==rootQ) return;

        parent[rootP] = rootQ;
    }
}




