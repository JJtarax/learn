package array;

import java.util.ArrayList;

public class _array_list {
    public static void main(String[] args) {

        // ArryList = a resizable array.
        // __________ Elements can be added and removed after comilation phase
        // __________ store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hammburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
