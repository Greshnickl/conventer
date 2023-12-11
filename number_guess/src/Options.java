import java.util.Scanner;
public class Options {

    public static void game(){
        rules();
        int min = 1;
        int attempt = 1;
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int num = NumberGuess.generate_number(max);
        interval(min, max);
        int guess = sc.nextInt();
        if (NumberGuess.check_number(min, max, num, guess).equals("s")){
            System.out.println("Number is bigger");
            attempt++;
            min = guess;
            interval(min, max);
        } else if (NumberGuess.check_number(min, max, num, guess).equals("b")){
            System.out.println("Number is smaller");
            attempt++;
            max = guess;
            interval(min, max);
        } else if (NumberGuess.check_number(min, max, num, guess).equals("e")){
            System.out.println("Number is away from interval");
            interval(min, max);
        }
        while (guess != num) {
            guess = sc.nextInt();
            if (NumberGuess.check_number(min, max, num, guess).equals("s")){
                System.out.println("Number is bigger");
                attempt++;
                min = guess;
                interval(min, max);
            } else if (NumberGuess.check_number(min, max, num, guess).equals("b")){
                System.out.println("Number is smaller");
                attempt++;
                max = guess;
                interval(min, max);
            } else if (NumberGuess.check_number(min, max, num, guess).equals("i")){
                System.out.println("Number is away from interval");
                interval(min, max);
            }
        }
        System.out.println("You guessed number from "+attempt+" attempts, Congrats!\n");
        restart();
    }
    public static void rules(){
        System.out.println("""
                Welcome to the "number guess game"
                
                In this you need to guess random number between 1 and your number
                After every attempt will be displayed hint
                
                Good Luck
                
                To start game write number from 10 to 1M:
                
                """);
    }

    public static void interval(int min, int max){
        System.out.println("Now number is between "+min+" and "+max+". Make your next turn: ");
    }

    public static void restart(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                To play one more time write "restart"
                To exit the game write "exit"
                
                """);
        String op = sc.nextLine();
        if (op.equals("exit")){
            System.exit(0);
        } else if (op.equals("restart")){
            game();
        } else {
            System.out.println("invalid operation, try again");
            restart();
        }
    }
}
