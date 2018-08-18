/**
 * Created by Justyna Gorczyca on 17.10.2017.
 */
public class Test {

    public static void main(String[] args)
    {
        Counter number = new Counter(0);
        Thread ithread = new Thread(new Increment(number));
        Thread dthread = new Thread(new Decrement(number));
        ithread.start();
        dthread.start();
        try {
            dthread.join();
            ithread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + number.getNumber());
    }
}
