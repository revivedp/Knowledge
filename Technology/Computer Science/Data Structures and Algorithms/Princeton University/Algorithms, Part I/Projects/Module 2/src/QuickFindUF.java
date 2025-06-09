public class QuickFindUF{
    private int[] id; // Declaring set of objects.

    public QuickFindUF(int N) {
        id = new int[N]; // Set of objects will contain N objects.
        for (int i = 0; i < N; i++) { // 0 to N
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q]; // check if object is the same.
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public void printState(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}