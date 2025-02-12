package MultiThreading.task3;

public class Main {
    public static void main(String[] args) {
        ThreadThree t1 = new ThreadThree();
        t1.start();
        ThreadThree t2 = new ThreadThree();
        t2.start();
        ThreadThree t3 = new ThreadThree();
        t3.start();
    }
}
