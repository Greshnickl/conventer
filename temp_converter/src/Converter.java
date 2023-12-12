public class Converter {

    public static boolean checkMin(String t, double temp){

        switch (t){
            case "C":
                if (temp < -273.15){
                    return false;
                }
                break;
            case "F":
                if (temp < -459.67){
                    return false;
                }
                break;
            case "K":
                if (temp < 0){
                    return false;
                }
                break;
            case "N":
                if (temp < -90.14){
                    return false;
                }
                break;
        }
        return true;
    }
    public static boolean checkT(String t){
        String[] temps = {"C", "F", "K", "N"};
        for (String i : temps){
            if (i.equals(t)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkTM (String input, double temp){
        if (checkT(input)){
            if (checkMin(input, temp)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static double cTof(double input){
        return Math.round(((input * ((double) 9 /5)) + 32) * 1000.0) / 1000.0;
    }
    public static double cTok (double input){
        return Math.round(((input + 273.15) * 1000.0)) / 1000.0;
    }
    public static double cTon (double input){
        return Math.round(((input * 0.33) * 1000.0)) / 1000.0;
    }
    public static double fToc (double input){
        return Math.round(((input - 32) * ((double) 5 /9)) * 1000.0) / 1000.0;
    }
    public static double kToc (double input){
        return Math.round(((input - 273.15) * 1000.0)) / 1000.0;
    }
    public static double nToc (double input){
        return Math.round((input * 3.03) * 1000.0) / 1000.0;
    }

}
