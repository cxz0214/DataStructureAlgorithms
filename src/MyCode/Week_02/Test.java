package MyCode.Week_02;

public class Test {
    public static void main(String[] args) {
        Array<Student> students = new Array<>(100);
        for (int i = 0; i < 10;i++){
            students.addLast(new Student("张"+i,i+1));
        }
        System.out.println(students);
        students.add(0,new Student("李咦",1));
        System.out.println(students);
        students.addFirst(new Student("张明",23));
        System.out.println(students);
        System.out.println(students.contains(new Student("张6",7)));
        System.out.println(students.find(new Student("张2",3)));
        System.out.println(students.isEmpty());
        System.out.println(students.getCapacity());
        System.out.println(students.getSize());
        System.out.println(students.remove(3));
        System.out.println(students);
        System.out.println(students.removeFirst());
        System.out.println(students);
        System.out.println(students.removeLast());
        System.out.println(students);
        students.set(3,new Student("加油",3));
        System.out.println(students);

    }
}
