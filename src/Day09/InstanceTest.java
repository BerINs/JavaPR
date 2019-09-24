package Day09;

public class InstanceTest {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student();
        stus[1] = new Student();
        System.out.println(stus[1]);
    }


}

class Student{

}