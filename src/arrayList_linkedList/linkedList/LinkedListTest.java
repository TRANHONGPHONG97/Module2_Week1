package arrayList_linkedList.linkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(6);
        list.add(5,4);
        list.add(1,8);
        list.add(2,3);
        list.printlist();
        list.indexOf(3);
        list.addFirst(9);
        list.get(5);
        list.remove(2);
        list.addLast(7);
        list.size();
        System.out.println(list);
        list.contains(4);
        list.printlist();
    }
}
