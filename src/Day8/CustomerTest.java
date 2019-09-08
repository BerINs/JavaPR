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
 * 无: 使用void来表示,可以使用return;结束   return后不可声明表达式
 *
 * 方法名：属于标识符，
 * 形参是可以被调用的
 *
 * 方法体：方法功能的体现
 *
 * return关键字的使用：
 *  1：使用范围：使用在方法体中
 *  2：作用 结束方法
 *         针对有返回值类型的方法，使用return数据方法返回所要的语句
 *
 *  方法的使用： 可以调用当前类的属性或方法
 *              特殊的：方法A中又调用了A方法 （递归方法）
 *              方法中不可以定义别的方法
 *
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();

        cust1.sleep(8);

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