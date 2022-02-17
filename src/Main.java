
public class Main {

    /*
    OISTER OF THE WEEK - 2. CHALLENGE
    This program checks whether a string argument can be represented as a number.
     */

    private static boolean isNumber(String input){

        // checks if the input is an integer
        try{
            Integer.parseInt(input);
            System.out.println("'" + input + "' is an integer");
            return true;
        }
        catch (NumberFormatException e){
        }

        // checks if the input is a floating point number
        try{
            Double.parseDouble(input);

            if (input.toLowerCase().contains("e")){
                System.out.println("'" + input + "' is a floating point number in scientific notation");
            }
            else{
                System.out.println("'" + input + "' is a floating point number");
            }
            return true;
        }
        catch (NumberFormatException e){
        }

        System.out.println("'" + input + "' is not a number");
        return false;
    }


    public static void main(String[] args) {

        // testing strings representing a number
        System.out.println(isNumber("10"));
        System.out.println(isNumber("-10"));
        System.out.println(isNumber("10.1"));
        System.out.println(isNumber("-10.1"));
        System.out.println(isNumber("1e5"));
        System.out.println(isNumber("2e3f"));
        System.out.println(isNumber("5e4d"));

        // testing strings not representing number
        System.out.println(isNumber("a"));
        System.out.println(isNumber("x 1"));
        System.out.println(isNumber("a-2"));
        System.out.println(isNumber("1e7g"));
        System.out.println(isNumber("-"));

    }

}
