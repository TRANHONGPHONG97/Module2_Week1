package arrayList_linkedList.linkedList;

public class LinkedList<E> {
    private Node head;
    private int numNodes;
    private boolean flag;

    public LinkedList() {

    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null)
            addFirst(e);
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
        }
    }

    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }

        numNodes--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        System.out.println(temp.data);
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public E clone() {
        LinkedList<E> newList = new LinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            newList.addLast((E) temp.data);
            temp = temp.next;
        }
        return (E) newList;
    }


    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int count = 0;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                count = i;
                break;
            } else {
                temp = temp.next;
            }
        }
        return count;
    }

    public void printlist() {
        Node temp = head;
        String str = "[ ";
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        Node temp = head;
        String str = "[ ";
        while (temp != null) {
            if (temp.next == null) {
                str += temp.data;
                break;
            }
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += " ]";
        return "MyLinkedList{" +
                "head=" + str +
                ", numNodes= " + numNodes +
                '}';
    }
}



