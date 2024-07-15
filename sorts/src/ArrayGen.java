import java.util.*;
public class ArrayGen {
    public static int[] returnArr(int size) {
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
