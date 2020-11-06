package Day11;

/**
 * @author BerINs
 * @date 11/7/20 12:14 AM
 */


class Reader {
    int readerID;
    String readerName;
    String readerPwd;
    static int nextReaderID;

    static {
        nextReaderID = 1001;
    }
    public Reader() {
        readerID = nextReaderID++;
//        readerName = "";
//        readerPwd = "6666";
    }

    public static void main(String[] args) {
        Reader r1 = new Reader();
        Reader r2 = new Reader();
        Reader r3 = new Reader();
        r2 = r1;
        System.out.println("第一个读者ID：" + r1.readerID);
        System.out.println("第二个读者ID：" + r2.readerID);
        System.out.println("第三个读者ID：" + r3.readerID);
    }
}
