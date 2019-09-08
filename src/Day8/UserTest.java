package Day8;

/**
 *  成员变量和局部变量的区别
 *  1.权限修饰符
 *  2.有无默认初始化值  局部变量形参在调用时赋值便可
 *  3.属性加载到堆，局部变量加载到栈
 */

public class UserTest {

}

class User {

    String name;    //成员变量
    int age;
    boolean isMale;

    public void talk(String language) {
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat(String food) {
        food = "烙饼";    //局部变量
        System.out.println("北方人喜欢吃：" + food);
    }
}