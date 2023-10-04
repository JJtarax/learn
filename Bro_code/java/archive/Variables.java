public class Variables {

    public static void main(String[] args) {

        boolean a = false; // size: 1bit type: primitive value: true or false
        byte n1 = 1; // size: 1byte type: primitive value: -128 - 127
        short n2 = 2; // size: 2bytes type: primitive value: -32,768 - 32,767
        int n3 = 3; // size: 4bytes type: primitive value: -2billion - 2billion
        long n4 = 4; // size: 8bytes type: primitive value: -9quintillion to 9quintillion

        float n5 = 5.5f; // size: 4bytes type: primitive value: fractional number up to 15 digits ex.
                         // 3.141592f
        double n6 = 6.66; // size: 8bytes type: primitive value: fractional number up to 15 digits ex.
                          // 3.141592653589793

        char symbol = '@'; // size: 2bytes type: primitive value: single character/letter/ASCII value ex.
                           // 'f'
        String name = "Bro"; // size:varies type: reference value: a sequence of characters ex."Hello world!"

        System.out.println("Hello " + name);
        System.out.println(a);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(symbol);

    }
}