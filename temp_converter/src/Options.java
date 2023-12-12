import java.util.Scanner;
public class Options {
    public static void mainOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to temperature converter.
                
                To see available temperature units write "help"
                To start transfer write "start"
                To exit write "exit"
                """);
        String command = scanner.nextLine().toLowerCase();
        switch (command){
            case "help":
                help();
                mainOption();
                break;
            case "start":
                start();
                mainOption();
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Invalid command, try again.\n");
                mainOption();
                break;
        }
    }

    public static void help(){
        System.out.println("""
                Possible temperature units:
                
                C - (Celsius)
                F - (Fahrenheit)
                K - (Kelvin)
                N - (Newton)
                
                """);
    }
    public static String takeTemp(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toUpperCase();
    }
    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write input temperature unit:");
        String input = takeTemp();
        while (!Converter.checkT(input)){
            System.out.println("Wrong unit, try again");
            input = takeTemp();
        }
        System.out.println("Write temperature value:");
        double temp = sc.nextDouble();
        while(!Converter.checkTM(input, temp)){
            System.out.println("Wrong value, try again");
            temp = sc.nextDouble();
        }
        System.out.println("Write output temperature unit:");
        String output = takeTemp();
        while (!Converter.checkT(output)){
            System.out.println("Wrong unit, try again");
            output = takeTemp();
        }
        if (input.equals(output)){
            System.out.println(temp+" "+input+" = "+temp+" "+output);
        }
        switch (input){
            case "C":
                switch (output){
                    case "F":
                        System.out.println(temp+" "+input+" = "+Converter.cTof(temp)+" "+output);
                        break;
                    case "K":
                        System.out.println(temp+" "+input+" = "+Converter.cTok(temp)+" "+output);
                        break;
                    case "N":
                        System.out.println(temp+" "+input+" = "+Converter.cTon(temp)+" "+output);
                        break;
                }
                break;
            case "F":
                switch (output){
                    case "C":
                        System.out.println(temp+" "+input+" = "+Converter.fToc(temp)+" "+output);
                        break;
                    case "K":
                        System.out.println(temp+" "+input+" = "+Converter.cTok(Converter.fToc(temp))+" "+output);
                        break;
                    case "N":
                        System.out.println(temp+" "+input+" = "+Converter.cTon(Converter.nToc(temp))+" "+output);
                        break;
                }
                break;
            case "K":
                switch (output){
                    case "C":
                        System.out.println(temp+" "+input+" = "+Converter.kToc(temp)+" "+output);
                        break;
                    case "F":
                        System.out.println(temp+" "+input+" = "+Converter.cTof(Converter.kToc(temp))+" "+output);
                        break;
                    case "N":
                        System.out.println(temp+" "+input+" = "+Converter.cTon(Converter.kToc(temp))+" "+output);
                        break;
                }
                break;
            case "N":
                switch (output){
                    case "C":
                        System.out.println(temp+" "+input+" = "+Converter.nToc(temp)+" "+output);
                        break;
                    case "F":
                        System.out.println(temp+" "+input+" = "+Converter.cTof(Converter.nToc(temp))+" "+output);
                        break;
                    case "K":
                        System.out.println(temp+" "+input+" = "+Converter.cTok(Converter.nToc(temp))+" "+output);
                        break;
                }
                break;
        }
    }
}
