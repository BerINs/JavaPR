package thread;

/**
 * @author BerINs
 * @date 2020/11/8 下午4:41
 */


class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello World!");
        }
    }
}


class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("大家好");
        }
    }
}
