package gr.codelearn.oop.collection.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        arraysListsActions();
    }

    private static void arraysListsActions(){
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList50 = new ArrayList<>(50);
        arrayList.add("1");
        arrayList.add("1");
        ArrayList<String> newMutableList = new ArrayList<>(arrayList);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6); // immutable
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        //integers.add(2);
    }

    private static void linkedListsActions(){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("1");
    }
}
