package MultiThreading.task2;

public class Main {
    public static void main(String[] args) {
    ThreadTwo t2 = new ThreadTwo();
        t2.start();
        t2.run();
        ThreadTwo tt2 = new ThreadTwo();
        tt2.start();
    }
}
