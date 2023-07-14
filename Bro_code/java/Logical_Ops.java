package learn.Bro_code.java;

import java.util.Scanner;

public class Logical_Ops {

    public static void main(String[] args) {

        // && = (and)
        // || = (or)
        // ! = (not)

        // &&
        int temp = 15;
        if (temp > 30) {
            System.out.println("It's is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It's warm outside");
        } else {
            System.out.println("It's is cold outside");
        }

        // ||
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }

        // !
        System.out.println("You are playing a game! Press q or Q to quit");
        String re = scanner.next();

        if (re.equals("q") && !re.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
        scanner.close();
    }
}
