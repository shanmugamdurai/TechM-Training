package Task5;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask5 {
    public static void main(String[] args) {
        int limit = 1000000;
        int numThreads = 10;
        List<Thread> threads = new ArrayList<>();
        List<PrimeSumCalculator> calculators = new ArrayList<>();

        int chunkSize = limit / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * chunkSize;
            PrimeSumCalculator calculator = new PrimeSumCalculator(start, end);
            calculators.add(calculator);
            Thread thread = new Thread(calculator);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads.get(i).join();
                totalSum += calculators.get(i).getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of primes up to " + limit + " is: " + totalSum);
    }
}

class PrimeSumCalculator implements Runnable {
    private int start, end;
    private long sum = 0;

    public PrimeSumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
