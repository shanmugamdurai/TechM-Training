package MultiThreading.task2;

public class ThreadTwo extends Thread {
    public void run() {
        System.out.println("From ThreadTwo");
        System.out.println("From ThreadTwo");
        System.out.println(10/0);
    }
}
