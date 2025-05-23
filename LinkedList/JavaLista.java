package LinkedList;
public class JavaLista {
    // public JavaLista(int[] array) {
    //     LinkedList<Integer> list = new LinkedList<>();
    //     for (int i = 0; i < array.length; i++) {
    //         list.addHead(array[i]);
    //     }
    //     System.out.println(list);
    // }

    private LinkedList<Integer> list;

    public JavaLista(int[] array) {
        list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            list.addHead(array[i]);
        }
    }

    @Override
    public String toString() {
        return "JavaLista [" + list + "]";
    }

    
}
