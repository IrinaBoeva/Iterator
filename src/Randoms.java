import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>(){
            //Random random = new Random();
            @Override
            public boolean hasNext(){
                return true;
            }
            @Override
            public Integer next(){
                int i = max - min + 1;
                return min + random.nextInt(Math.abs(i));
            }
        };
    }
}