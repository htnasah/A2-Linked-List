package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.toString());
        System.out.println(list.toString());
        System.out.println(list.isSymmetrical());
    }
}
