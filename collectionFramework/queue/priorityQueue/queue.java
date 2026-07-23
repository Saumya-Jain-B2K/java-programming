package queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> list = new PriorityQueue<>();
        list.add(10);
        list.poll();
    }
}
