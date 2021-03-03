package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(20);
        list.add(3);
        list.reverse();
        list.removeRepeats();
        System.out.println(list.toString());

    }
}
