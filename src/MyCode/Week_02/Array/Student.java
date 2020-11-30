package MyCode.Week_02.Array;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "{姓名:"+name+","+"年龄:"+age+"}";
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
    @Override
    public boolean equals(Object student){
        if(this == student)
            return true;
        if(student == null)
            return false;
        if(this.getClass() != student.getClass())
            return false;
        Student stu = (Student)student;
        return this.name.equals(((Student) student).name) && this.age == ((Student) student).age;
    }
}
