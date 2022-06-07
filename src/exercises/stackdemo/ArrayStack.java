package exercises.stackdemo;
public class ArrayStack {
    public static void main(String[] args) {
        MyStack <String> myStack = new MyStack<>();
        myStack.push("Chicken");
        myStack.push("Dog");
        myStack.push("Cat");
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);


//        ArrayDeque<String> stack = new ArrayDeque<>();
//        stack.push("Chicken");
//        stack.push("Dog");
//        stack.push("Cat");
//        System.out.println("Stack ban đầu là: " + stack);
//        System.out.println("Phần tử trên cùng là: " + stack.pop());
//        System.out.println("Stack sau khi pop() là: " + stack);
//        System.out.println("Phần tử trên cùng là: " + stack.peek());
//        System.out.println("Stack sau khi peek() là: " + stack);
//        Queue queue = new Queue() {
//            @Override
//            public boolean add(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean offer(Object o) {
//                return false;
//            }
//
//            @Override
//            public Object remove() {
//                return null;
//            }
//
//            @Override
//            public Object poll() {
//                return null;
//            }
//
//            @Override
//            public Object element() {
//                return null;
//            }
//
//            @Override
//            public Object peek() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public Object[] toArray(Object[] a) {
//                return new Object[0];
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        };
    }
}

