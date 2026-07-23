package queue.arrayDeque;
import java.util.*;

public class queue {
    public static void main(String[] args) {
        //using queue ad the colletion we cant's use offerFirst and last similarly removeFirst and last hende we use Deque
        // Queue<Integer> list = new ArrayDeque<>();

        Deque<Integer> list = new ArrayDeque<>();
        list.offer(10);
        list.offerFirst(1);
        list.offerLast(100);
        System.out.println(list);

        //using removal functions
        list.pollFirst();
        System.out.println(list);
        list.add(20);
        System.out.println(list);
        list.pollLast();
        System.out.println(list);
    }
}
