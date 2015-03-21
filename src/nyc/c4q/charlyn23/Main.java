package nyc.c4q.charlyn23;

public class Main {







    public static void table(int x) {

        String results;
        int j = 1;

        for (int i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        table(5);
    }
}


