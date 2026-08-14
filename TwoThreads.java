
package threadd;
public class TwoThreads {

    public static void main(String[] args) {
        
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("The First Thread is on its way: " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("The Second Thread is on its way: " + i);
            }
        });
        thread1.start();
        thread2.start();
    }
}
