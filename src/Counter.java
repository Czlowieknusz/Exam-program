import javax.swing.*;

public class Counter extends Thread {

    private long Start;
    private Main main;

    public Counter(Main main) {
        Start = System.currentTimeMillis();
        this.main = main;
    }

    public void run() {
        while (true) {
            main.convertLongToDate(System.currentTimeMillis() - Start);
            try {
                this.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
