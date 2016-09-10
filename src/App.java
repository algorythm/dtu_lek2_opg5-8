/**
 * Created by AndersWOlsen on 10-09-2016.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean quit = false;
        while (!quit)
        {
            int choice = Input("Vælg en opgave");
            switch(choice)
            {
                case 0:
                    System.out.println("Farvel!");
                    quit = true;
                case 5:
                    System.out.println("Du har valgt opgave 5!");
                default:
                    System.out.println("Kunne ikke finde det valgte opgavenummer.");
            }
        }
    }

    public static String Question(String question)
    {
        boolean usableAnswer = false;
        String answer = new String();

        while (!usableAnswer)
        {
            System.out.println(question + "? ");
            Scanner in = new Scanner(System.in);

            try
            {
                answer = in.nextLine();
                usableAnswer = true;
            }
            catch (Exception ex)
            {
                System.out.println("Skal være tekst, prøv igen!");
            }
        }

        return answer;
    }

    public static int Input (String inputString) {
        boolean usableAnswer = false;
        int answer = -1;

        while (usableAnswer)
        {
            System.out.print(inputString + ": ");
            Scanner in = new Scanner(System.in);

            try
            {
                answer = in.nextInt();
                usableAnswer = true;
            }
            catch (Exception ex)
            {
                System.out.println("Skal være et heltal! Prøv igen.");
            }

        }

        return answer;
    }
}
