
class worker1 implements Runnable {

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Thread 1 is working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception (e.g., log it or recover gracefully)
                e.printStackTrace();
            }
        }
    }
}
class worker2 implements Runnable {

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("hello from thread 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception (e.g., log it or recover gracefully)
                e.printStackTrace();
            }
        }
    }
}
public class L23C2 {
    Thread t1, t2;
    L23C2(){
        t1 = new Thread(new worker1());
        t2 = new Thread(new worker2());
        
        t1.setPriority(5);
        t2.setPriority(10);
        
        t1.start();
        t2.start();
    }
    public static void main(String[] args){
        new L23C2();
    }
}
