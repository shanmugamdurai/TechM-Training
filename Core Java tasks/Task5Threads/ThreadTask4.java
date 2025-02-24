package Task5;

public class ThreadTask4 implements Runnable {
    private int row;
    private int[][] A, B, C;

    public ThreadTask4(int row, int[][] A, int[][] B, int[][] C) {
        this.row = row;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public void run() {
        int colsB = B[0].length;
        int colsA = A[0].length;
        for (int j = 0; j < colsB; j++) {
            C[row][j] = 0;
            for (int k = 0; k < colsA; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] B = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        Thread[] threads = new Thread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new Thread(new ThreadTask4(i, A, B, C));
            threads[i].start();
        }

        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
