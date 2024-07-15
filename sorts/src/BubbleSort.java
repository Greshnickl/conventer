public class BubbleSort {
    private int iterations;
    private int[] array;
    private long time;

    public BubbleSort(int[] array) {
        this.array = array;
        iterations = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                iterations++;
            }
        }
        long endTime = System.nanoTime();
        this.time = endTime - startTime;
    }

    public int getIterations() {
        return iterations;
    }

    public int[] getArray() {
        return array;
    }

    public long getTime() {
        return time;
    }
}
