package MyCode.Week_03;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 10 ; i ++){
            linkedList.addLast(i);
        }
        System.out.println(linkedList);
        linkedList.addFirst(20);
        System.out.println(linkedList);
        linkedList.addLast(30);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.constains(6));
        System.out.println(linkedList.constains(60));
        linkedList.set(2,60);
        System.out.println(linkedList);
    }
}
