package exercises.stackdemo;

import java.util.ArrayDeque;
import java.util.EmptyStackException;

public class MyStack <T>{
    private ArrayDeque<T> stack;
    public MyStack(){
        stack = new ArrayDeque<>();
    }
    public void push(T element) {
        if(stack== null)
            return;
        stack.add(element);
    }
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
