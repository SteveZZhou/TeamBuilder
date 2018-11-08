import java.util.Scanner;

public abstract class InputOutput {

    public static void output(String string) {
        System.out.print(string);
        System.out.println();
        return;
    }

    static int inputInt (String prompt){
        int line;
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        line = in.nextInt();
        return line;
    }

    	public static String input (String string) {
        System.out.println(string);
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        return statement;
    }


    static char inputChar(String prompt) {
        char result = (char) 0;
        Scanner in = new Scanner (System.in);
        try {
            result = in.nextLine().charAt(0);
        } catch (Exception e) {
            result = (char) 0;
        }
        return result;}


}
