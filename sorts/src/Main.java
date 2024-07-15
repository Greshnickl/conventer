public class Main {
    public static void main(String[] args) {
        int[] randArr = ArrayGen.returnArr(1000);
        System.out.println("Not sorted array:");
        for (int i = 0; i < randArr.length; i++) {
            System.out.print(randArr[i] + ", ");
            if ((i + 1) % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println("Sorted array:");
        BubbleSort bubbleSort = new BubbleSort(randArr);
        int[] bubbleArr = bubbleSort.getArray();
        System.out.println("Iterations done: " + bubbleSort.getIterations());
        System.out.println("Time taken: " + bubbleSort.getTime() + " ns " + "(" +  (bubbleSort.getTime() / 1000000) + " ms)");
        for (int i = 0; i < bubbleArr.length; i++) {
            System.out.print(bubbleArr[i] + ", ");
            if ((i + 1) % 10 == 0 && i != 0) {
                System.out.println();
            }
        }

    }
}