package arrayList_linkedList.arrayListList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        myList.add(7);
        myList.add(9);

        myList.add(2,4);
//        myList.remove(1);
//        System.out.println(myList.indexOf(7));
//        System.out.println(myList.contains(5));
//        System.out.println(myList.get(9));
//        myList.clear();
        System.out.println(myList);

    }
}
