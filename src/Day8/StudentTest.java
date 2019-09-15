package Day8;

public class StudentTest {
    public static void main(String[] args) {

        //声明一个Student数组
        Student[] stus = new Student[20];   //String[] arr = new String[];

        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student();
            //student属性赋值
            stus[i].number = (i + 1);
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random()*(100-0+1));
        }
        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }
}

class Student {
    int number; //学号
    int state;  //年级
    int score;  //成绩

    public String info() {
        return "学号：" + number + ", 年级：" + state + "，成绩:" + score;
    }
}
