public class String_methods {
    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "JJtarax";

        // boolean result = name.equalsIgnoreCase("bro");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("o");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();// gets rid of space in start and end
        String result = name.replace('a', 'o');

        System.out.println(result);
    }
}
