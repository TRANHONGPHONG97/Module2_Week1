package exercises.queuedemo;
import java.util.ArrayDeque;
import java.util.Queue;
public class ArrayQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("An");
        queue.offer("Bình");
        queue.offer("Chiến");
        System.out.println("Queue ban đầu là: " + queue);
        System.out.println("Phần tử đẩu tiên là: " + queue.peek());
        System.out.println("Queue sau khi peek() là" + queue);
        System.out.println("Phần tử đầu tiên là: " + queue.poll());
        System.out.println("Queue sau khi poll() là: " + queue);
    }
}
