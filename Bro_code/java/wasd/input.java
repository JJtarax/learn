package learn.Bro_code.java.wasd;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("how old are you? ");
        int age = scanner.nextInt();

        System.out.print("Hello, " + name);
        System.out.println(" You are " + age + " old");

    }
}
