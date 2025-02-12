package MultiThreading.task4;

public class Main {
    public static void main(String[] args) {
        ThreadRunnableOne tr1 =new ThreadRunnableOne();
        Thread t = new Thread(tr1);
        t.start();
    }
}
