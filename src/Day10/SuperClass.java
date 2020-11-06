package Day10;

/**
 * @author BerINs
 * @date 11/6/20 10:28 PM
 */


public class SuperClass {
    int x = 5;
    int getX() {
        return x;
    }
}

class SubClass extends SuperClass {
    int y = 10;
    char ch = 'a';
    int getX() {
        return y;
    }
    int getCh() {
        return ch;
    }
}

 class UseSuperSub {
    public static void main(String[] args) {
        SuperClass sc,sc_ref;
        SubClass sb,sb_ref;
        sc = new SuperClass();
        sb = new SubClass();
        sc_ref = sb;
        System.out.println(sc.getX());
        System.out.println(sc_ref.getX());
//        System.out.println(sc_ref.getCh());
        System.out.println(sb.getX());
        System.out.println(sb.getCh());
    }
}
