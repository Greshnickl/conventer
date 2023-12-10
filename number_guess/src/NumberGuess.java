import java.util.Random;
public class NumberGuess {




    public static int generate_number(int max){
        Random r = new Random();
        return r.nextInt(max);
    }
}
