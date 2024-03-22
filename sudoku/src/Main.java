import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][] sudoku = createPrimalTable();

        sudoku = randomTable(sudoku);
        printTable(sudoku);
    }
    public static int[][] randomTable(int[][] table){
        Random random = new Random();
        int[] rands = generateUniqueRandomNumbers();
        swapRegionHorizontal(rands[0], rands[1], table);
        rands = generateUniqueRandomNumbers();
        swapRegionVertical(rands[0], rands[1], table);
        for (int i = 0; i < 3; i++){
            rands = generateUniqueRandomNumbers();
            swapRow(rands[0], rands[1], i, table);
            swapColumn(rands[0], rands[1], i, table);
        }
        rands = generateUniqueRandomNumbersOneToNine();
        swapNums(rands[0], rands[1], table);
        return table;
    }
    public static int[] generateUniqueRandomNumbersOneToNine() {
        Random random = new Random();
        int[] result = new int[2];
        result[0] = random.nextInt(1, 10);

        do {
            result[1] = random.nextInt(1, 10);
        } while (result[1] == result[0]);

        return result;
    }
    public static int[] generateUniqueRandomNumbers() {
        Random random = new Random();
        int[] result = new int[2];
        result[0] = random.nextInt(3);
        do {
            result[1] = random.nextInt(3);
        } while (result[1] == result[0]);

        return result;
    }
    public static void swapRow(int row1, int row2, int reg, int[][] table){
        int temp;
        for (int i = 0; i < 9; i++){
            temp = table[row1 + reg*3][i];
            table[row1 + reg*3][i] = table[row2 + reg*3][i];
            table[row2 + reg*3][i] = temp;
        }
    }
    public static void swapColumn(int col1, int col2, int reg, int[][] table){
        int temp;
        for (int i = 0; i < 9; i++){
            temp = table[i][col1 + reg*3];
            table[i][col1 + reg*3] = table[i][col2 + reg*3];
            table[i][col2 + reg*3] = temp;
        }
    }
    public static void swapRegionHorizontal(int reg1, int reg2, int[][] table){
        int temp;
        for (int i = 0; i < 3; i++){
            for (int o = 0; o < 9; o++){
                temp = table[reg1*3 + i][o];
                table[reg1*3 + i][o] = table[reg2*3 + i][o];
                table[reg2*3 + i][o] = temp;
            }
        }
    }
    public static void swapRegionVertical(int reg1, int reg2, int[][] table){
        int temp;
        for (int i = 0; i < 3; i++){
            for (int o = 0; o < 9; o++){
                temp = table[o][reg1*3 + i];
                table[o][reg1*3 + i] = table[o][reg2*3 + i];
                table[o][reg2*3 + i] = temp;
            }
        }
    }
    public static void swapNums(int num1, int num2, int[][] table){
        for (int i = 0; i < table.length; i++){
            for (int o = 0; o < table[i].length; o++){
                if (table[i][o] == num1 | table[i][o] == num2){
                    if (table[i][o] == num1){
                        table[i][o] = num2;
                    } else if(table[i][o] == num2){
                        table[i][o] = num1;
                    }
                }
            }
        }
    }
    public static void printTable(int[][] table){
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < table.length; i++){
            System.out.print("| ");
            for (int o = 0; o < table[i].length; o++){
                if ((o + 1) % 3 == 0){
                    System.out.print(table[i][o] + " | ");
                } else {
                    System.out.print(table[i][o] + " ");
                }


            }
            if((i + 1)% 3 == 0){
                System.out.print("\n+-------+-------+-------+");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static int[][] createPrimalTable(){
        int[][] table = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = ((i / 3) + 3 * (i % 3) + j) % 9 + 1;
            }
        }
        return table;
    }
}