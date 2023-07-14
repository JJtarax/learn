package learn.Bro_code.java;

import java.util.Scanner;

public class math_class {
    
    public static void main(String[] args) {
        
        double a = 3.14;
        double b = -10;

        double c = Math.max(a, b);
        System.out.println(c);

        double d = Math.min(a, b);
        System.out.println(d);

        double e = Math.sqrt(a);
        System.out.println(e);

        double f = Math.abs(b);
        System.out.println(f);

        double g = Math.max(a, b);
        System.out.println(g);

        double h = Math.round(a);
        System.out.println(h);

        double i = Math.ceil(a);
        System.out.println(i);

        //

        double j;
        double k;
        double l;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter side A: ");
        j = scanner.nextDouble();

        System.out.println("Enter side B: ");
        k = scanner.nextDouble();

        l = Math.sqrt((j*j)+(k+k));

        System.out.println("The hypotenuse is : " + l);

        scanner.close();
    }

}
