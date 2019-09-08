package Day8;

public class PersonTest {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name + "的新年龄为：" + newAge);

        Person1 p2 = new Person1();
        p2.showAge();
    }

}

