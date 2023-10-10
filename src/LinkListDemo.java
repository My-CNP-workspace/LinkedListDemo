import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(0,100);
        al.add(1,200);
        al.add(2,300);

        LinkedList ll = new LinkedList(al);

        ll.add(0,"charitha");
        ll.add(1,"nayanajith");
        ll.add(2,1987);
        ll.add(3,"june");
        ll.add(4,12);

        System.out.println(ll);
        System.out.println(al);

        System.out.println(ll.getLast());

    }
}
