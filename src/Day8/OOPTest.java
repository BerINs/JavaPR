package Day8;

/*
    1.创建类，设计类的成员
    2.创建类的对象
    3.调用属性和方法

 */


public class OOPTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构：属性、方法

        //调用属性："对象.属性"
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用对象："对象.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        System.out.println();

        Person p2 = new Person();
        System.out.println(p2.name);    //值为null
        System.out.println(p2.isMale);  //值为false
        //如果创建一个类的多个对象，每个对象都独立的拥有一套类的属性(非static的）
        //意味着：如果我们修改一个对象的属性a，则不影响另一个属性的值

        System.out.println();
        Person p3 = p1; //地址值赋予
        System.out.println(p3.name);
        p3.age = 10;
        System.out.println(p1.age); //10
    }
}
        class Person {
            //属性
            String name;
            int age = 1;
            boolean isMale;

            //方法
            public void eat() {
                System.out.println("人可以吃饭");
            }

            public void sleep() {
                System.out.println("人可以睡觉");
            }

            public void talk(String language) {
        System.out.println("人可以说话，使用的是：" + language);
        }
        }