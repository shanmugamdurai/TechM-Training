package Task5;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ThreadTask3 {
    public static void main(String[] args) {
        int[] array = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        System.out.println("Original array: " + Arrays.toString(array));

        ForkJoinPool pool = new ForkJoinPool();
        ParallelMergeSort task = new ParallelMergeSort(array, 0, array.length - 1);
        pool.invoke(task);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

class ParallelMergeSort extends RecursiveAction {
    private int[] array;
    private int left;
    private int right;
    private static final int THRESHOLD = 500;

    public ParallelMergeSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if (right - left < THRESHOLD) {
            Arrays.sort(array, left, right + 1);
            return;
        }

        int mid = left + (right - left) / 2;
        ParallelMergeSort leftTask = new ParallelMergeSort(array, left, mid);
        ParallelMergeSort rightTask = new ParallelMergeSort(array, mid + 1, right);

        invokeAll(leftTask, rightTask);
        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        while (i <= mid)
            temp[k++] = array[i++];
        while (j <= right)
            temp[k++] = array[j++];

        System.arraycopy(temp, 0, array, left, temp.length);
    }
}
