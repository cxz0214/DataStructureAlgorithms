package MyCode.Week_01;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student another){
//        if(this.score < another.score)
//            return -1;
//        else if(this.score == another.score)
//            return 0;
//        else
//            return 1;
        return this.score - another.score;
    }
    @Override
    public boolean equals(Object student){
        if(this == student)
            return true;
        if(student == null)
            return false;
        if(this.getClass() != student.getClass())
            return false;
        Student another = (Student)student;
        return this.name.equals(another.name);
    }
    @Override
    public String toString(){
        return String.format("[姓名：%s,分数：%d]",name,score);
    }

    public static void main(String[] args) {
        Student student = new Student("陈信喆",23);
        System.out.println(student);
    }
}
