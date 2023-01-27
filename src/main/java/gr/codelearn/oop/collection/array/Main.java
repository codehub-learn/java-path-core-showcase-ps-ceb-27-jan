package gr.codelearn.oop.collection.array;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        instantiationExamples();
        System.out.println("//////////////");
        otherActions();
        System.out.println("//////////////");
        sortingActions();
    }

    private static void instantiationExamples() {
        int[] ints = new int[10];
        ints[0] = 4;
        ints[1] = 5;
        ints[ints.length - 1] = 2; // final index

        int[] ints2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ints3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[][] ints2d = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9, 10}};

        for (int i = 0; i < ints3.length; i++) {
            System.out.println(ints3[i]);
        }

        System.out.println("------------");

        for (int i = ints3.length - 1; i >= 0; i--) {
            System.out.println(ints3[i]);
        }

        System.out.println("------------");

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        boolean[] booleans = new boolean[10];
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }

        for (boolean aBoolean : booleans) {
            System.out.println(aBoolean);
        }

        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    private static void otherActions() {
        String[] strings = generateStrings();

        String[] newStrings = Arrays.copyOf(strings, 7);
        for (String newString : newStrings) {
            System.out.println(newString);
        }

        System.out.println("-----------");

        String[] copyOfRange = Arrays.copyOfRange(strings, 2, 3);
        for (String s : copyOfRange) {
            System.out.println(s);
        }

        System.out.println("-----------");

        System.out.println(strings);
        System.out.println(Arrays.toString(strings));

        int[] ints = new int[10];
        Arrays.fill(ints, 10);
        System.out.println(Arrays.toString(ints));

        int[] ints2 = {1, 3, 5, 7, 10, 12};
        System.out.println(Arrays.binarySearch(ints2, 2));

        int[] ints3 = {1, 3, 5, 7, 10, 12};
        int[] ints4 = {1, 3, 5, 7, 10, 12};
        System.out.println(ints3 == ints4);
        System.out.println(Arrays.equals(ints3, ints4));
    }

    private static void sortingActions() {
        String[] strings = generateStrings();

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, new CustomComparator());
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        }); // anonymous class
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, Comparator.reverseOrder());
        System.out.println(Arrays.toString(strings));
    }

    private static String[] generateStrings() {
        String[] strings = new String[3];
        strings[0] = "Ioannida";
        strings[1] = "Alex";
        strings[2] = "Manolia";
        return strings;
    }


}
