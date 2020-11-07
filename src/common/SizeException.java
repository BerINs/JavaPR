package common;

/**
 * @author BerINs
 * @date 2020/11/7 下午6:09
 */


public class SizeException extends Exception{
    String s;
    public SizeException() {
        s = "边长不合理，无法构成图形，请重新输入！";
    }
    public String toString() {
        return s;
    }
}
