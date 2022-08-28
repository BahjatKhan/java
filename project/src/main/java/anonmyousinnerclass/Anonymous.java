package anonmyousinnerclass;

public class Anonymous {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread");
        }

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Child thread");
            }
        }
        );
    }
}