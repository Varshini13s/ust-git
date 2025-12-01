package basics;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Geek1", "Geek2", "Geek3"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);
        Arrays.sort(names,Collections.reverseOrder());
        System.out.println(Arrays.toString(names));
    }
}