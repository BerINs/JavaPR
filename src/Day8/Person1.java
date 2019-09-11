package Day8;

public class Person1 {
    String name;
    int age;
    /*
        sex取值是1为男，0为女
     */
    int sex;    //sex取值是1为男，0为女

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age = " + age);
    }

    public int addAge(int i) {
        age+= i;
        return age;//
    }


}
