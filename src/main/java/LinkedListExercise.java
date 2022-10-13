import java.util.LinkedList;

public class LinkedListExercise {



    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pineapple");
        System.out.println(shoppingList);

        shoppingList.add(1,"Mango");
        System.out.println(shoppingList);
        shoppingList.removeFirst();
        System.out.println(shoppingList);

    }
}
