import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Welcome to (R)OCK, (P)APER, (S)CISSORS !!! ***");

        String choice = "";

        while (!choice.equals("R") && !choice.equals("P") && !choice.equals("S")) {
            System.out.println("Please Enter your choice 'R', 'P' or 'S'");
            choice = keyboard.nextLine();
        }

        String myChoice;
        String javaChoice;
        if (choice.equals("R")){
            myChoice = "Rock";}
        else if (choice.equals("P")){
            myChoice = "Paper";}
        else {myChoice = "Scissors";}


        System.out.println("You have chosen: " + myChoice);
        Random javaRandom = new Random();
        int random = javaRandom.nextInt(3);
        if (random == 0){javaChoice = "Rock";}
        else if (random == 1){javaChoice = "Paper";}
        else {javaChoice = "Scissors";}
        System.out.println("JAVA has chosen: " + javaChoice);

        if (myChoice.equals(javaChoice)){
            System.out.println("It's a DRAW!!!");
        }
    }
}
