/**
 * Created by Justyna Gorczyca on 17.10.2017.
 */
public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0;  i < Test2.ILOSC;   i++) {
            try {
                String message = buffer.take();
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
