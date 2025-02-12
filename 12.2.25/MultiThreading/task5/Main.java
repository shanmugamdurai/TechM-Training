package MultiThreading.task5;

public class Main {
    public static void main(String[] args) {
        ThreadRunnableTwo tr2 = new ThreadRunnableTwo();
        Thread t = new Thread(tr2);
        t.start();
        ThreadRunnableTwo tr = new ThreadRunnableTwo();
        Thread t1 = new Thread(tr);
        t1.start();
    }
}
