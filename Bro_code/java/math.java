package learn.Bro_code.java;

public class math {

    public static void main(String[] args) {

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        friends = friends % 2;
        System.out.println("There was " + friends + " friend, then");

        friends++;
        System.out.println("There was " + friends + " friend, then");

        friends--;
        System.out.println("There was " + friends + " friend, then");

        friends = friends * 2;
        System.out.println("There was " + friends + " friend, then");
    }
}