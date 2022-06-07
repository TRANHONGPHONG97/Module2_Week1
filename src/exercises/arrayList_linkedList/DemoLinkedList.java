package exercises.arrayList_linkedList;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Các phần tử là: ");
        System.out.println(linkedList);

        linkedList.set(2, "D");
        System.out.println(linkedList);

        linkedList.addFirst("Hello");
        System.out.println(linkedList);

    }
}

