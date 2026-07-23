package sets;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(40);
        st.add(70);
        System.out.println(st);

        //usind addAll method
        Set<Integer> st1 = new HashSet<>();
        st1.addAll(st);
        System.out.println(st1);

        //using iterator function
        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println("Element: " + itr.next());
        }

        //using remove method
        st.remove(40);
        System.out.println(st);

        //using remove all method
        st1.removeAll(st);
        System.out.println(st1);

        //using retainAll method
        st1.retainAll(st);
        System.out.println(st1);

        //using clear method
        st1.clear();
        System.out.println(st1);

        //using size method
        System.out.println(st.size());;

        //using contains
        System.out.println(st.contains(40));

        Set<Integer> st2 = new HashSet<>();
        st2.addAll(st);
        System.out.println(st2);
        //using contains all method
        System.out.println(st2.containsAll(st));

    }
}
