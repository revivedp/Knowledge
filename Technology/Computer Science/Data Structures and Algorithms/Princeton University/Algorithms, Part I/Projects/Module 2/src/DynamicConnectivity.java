import java.util.Scanner;

public class DynamicConnectivity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements:");
        int n = scanner.nextInt();
        QuickFindUF uf = new QuickFindUF(n);
        System.out.println("Enter pairs of connected elements (p q)");
        while (true) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (p == -1 && q == -1) break;

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println("Conectados: " + p + " - " + q);
            } else {
                System.out.println("Já estão conectados.");
            }

            System.out.print("Estado atual: ");
            uf.printState();
        }

        scanner.close();
        System.out.println("Encerrado.");
    }
}