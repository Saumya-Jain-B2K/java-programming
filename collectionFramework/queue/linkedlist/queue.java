package queue.linkedlist;
import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        //using offer instead of add to add elements on the queue
        list.offer(10);
        list.offer(20);
        list.offer(30);
        System.out.println(list);

        //using peek instead of elemnt to view the top of the queue that is the head
        //and the head id the first most element
        System.out.println(list.peek());

        //using poll instead of remove to remove the head element from the queue
        System.out.println(list.poll());
        System.out.println(list);

        list.poll();
        System.out.println(list);
    }
}
