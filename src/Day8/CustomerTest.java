package Day8;

/**
 * 类方法的声明和使用
 *
 * 方法：描述类该具有的功能
 * 比如：Math类
 *      Scanner类
 *      Arrays类
 *
 * 方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 *                      方法体
 *               }
 *      注意：static、final、abstract来修饰的方法
 *
 * java中规定的4种权限修饰符：private public protected 缺省      --封装性
 * 默认权限修饰符public
 *
 * 返回值类型： 有 / 无
 * 有:必须在方法声明时，指定返回值的类型，同时，需要使用return关键字来返回返回值的常量或者变量
 *
 * 无: 使用void来表示,可以使用return;结束
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
    }

}

class Customer {
    String name;
    int age;
    boolean isMale;

    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是：" + nation;
        return info;
    }
}