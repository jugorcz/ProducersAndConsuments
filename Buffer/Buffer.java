/**
 * Created by Justyna Gorczyca on 17.10.2017.
 */
import java.util.ArrayDeque;
import java.util.Stack;

public class Buffer {

    String message;
    Boolean empty;
    public Buffer(){
        empty = true;
    }

    public synchronized void put(String message) throws InterruptedException {
        while(!empty)
            wait();
        this.message = message;
        empty = false;
        notifyAll();
    }

    public synchronized String take() throws InterruptedException {
        while(empty)
            wait();
        empty = true;
        notifyAll();
        return message;
    }
}
