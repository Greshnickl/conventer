import java.util.Random;

public class NumberGuess {

    public static String check_number(int min, int max, int num, int guess){
        if (guess <= max && guess >= min){
            if (guess == num){
                return "e";
            } else if (guess < num){
                return "s";
            } else {
                return "b";
            }
        } else {
            return "i";
        }
    }


    public static int generate_number(int max){
        Random r = new Random();
        return r.nextInt(max) + 1;
    }
}
