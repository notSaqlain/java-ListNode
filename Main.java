import java.util.*;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws Exception {
        Node<String> node1 = new Node<>("Batt ");
        Node<String> node2 = new Node<>("Gandu ");

        System.out.println(node1);
        System.out.println(node2);

        node1.setNext(node2);

        System.out.println(node1);

        
        LinkedList<String> list = new LinkedList<>();
        //list.addHead(new Node<String>("Saqlain"));
        //list.addHead(new Node<String>("Khalid"));

        list.addHead("Saqlain");
        list.addHead("Khalid");
        list.addHead("Khalid");

        System.out.println(list);

        list.addTail("END!");
        System.out.println(list);

        list.remove("Khalid");
        list.remove("Kha");
        System.out.println(list);


    }
}