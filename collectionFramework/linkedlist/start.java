package linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class start{
    public static void main(String[] args){
        //defining an arraylist
        LinkedList<Integer> list = new LinkedList<>();

        //other ways of defining arraylist
        // List<Integer> arr = new ArrayList<>();
        // Collection<Integer> coll = new ArrayList<>();

        //using add method of collection in arraylist to add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(10);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        //chscking the size of list using size() method
        System.out.println(list.size());
        //then removing the element from the list using its index value
        list.remove(2);
        System.out.println(list);

        //addAll function
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(70);
        list2.add(80);
        list.addAll(list2);
        System.out.println(list);

        //removeAll function
        list.removeAll(list2);
        System.out.println(list);

        //using clear() method
        list2.clear();
        System.out.println(list2);
        System.out.println(list2.size());

        //using iterator method
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("Element: " + itr.next());
        }

        //using get method
        System.out.println(list.get(2));

        //using set method, basically used for updates in the values of the index of the list
        list.set(2, 30);
        System.out.println(list);

        //using contains
        System.out.println(list.contains(40));
        System.out.println(list.isEmpty());

        //using indexOf method
        System.out.println(list.indexOf(10));

        //using last index of method
        System.out.println(list.lastIndexOf(10));

        //using add first and last menthod for linkedlist
        list.addFirst(1);
        System.out.println(list);

        list.addLast(100);
        System.out.println(list);

        //using getFirst and getLast method
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //using removeFirst and removeLast
        System.out.println(list.removeFirst());
        System.out.println(list);

        System.out.println(list.removeLast());
        System.out.println(list);

        //using peek method
        System.out.println(list.peek());

        //using poll method
        System.out.println(list.poll());
        System.out.println(list);

        //using offer method
        list.offer(100);
        System.out.println(list);



    }
}