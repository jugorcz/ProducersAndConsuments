/**
 * Created by Justyna Gorczyca on 17.10.2017.
 */
public class Decrement implements Runnable{
    private Counter number;

    public Decrement(Counter number){
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000000; i++)
            number.decrement();
    }
}
