package sets;
import java.util.*;

public class linkedHashset {
    public static void main(String[] args) {
        Set<Integer> st = new LinkedHashSet<>();
        st.add(10);
        st.add(70);
        st.add(40);
        System.out.println(st);
    }
}
