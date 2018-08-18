/**
 * Created by Justyna Gorczyca on 17.10.2017.
 */
public class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public synchronized void increment(){
        number++;
    }

    public synchronized void decrement(){
        number--;
    }

    public int getNumber() {
        return number;
    }

}
