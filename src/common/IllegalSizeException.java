package common;

/**
 * @author BerINs
 * @date 2020/11/7 下午6:02
 */


public class IllegalSizeException extends Exception{
    String s;
    public IllegalSizeException() {
        s = "所输数值不能为负数";
    }
    public String toString() {
        return s;
    }
}

