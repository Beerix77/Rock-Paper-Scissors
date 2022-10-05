import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Welcome to (R)OCK, (P)APER, (S)CISSORS !!! ***");

        System.out.print("Enter your choice: ");
        String choice = keyboard.nextLine();
        if (!choice.equals("R") && !choice.equals("P") && !choice.equals("S")){
            System.out.println("You must choose 'R', 'P' or 'S'");
        }





    }

}