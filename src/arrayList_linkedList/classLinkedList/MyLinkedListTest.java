package arrayList_linkedList.classLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(20);
        linkedList.addFirst(15);
        linkedList.addFirst(12);
        linkedList.addFirst(119);
        linkedList.addFirst(21);
        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
