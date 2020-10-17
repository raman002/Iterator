import java.util.Iterator;

public class StmtIterator<T> implements Iterator<T> {

    private final Sequence<T> sequence;
    private int start;

    public StmtIterator(Sequence<T> sequence) {
        this.sequence = sequence;
    }


    @Override
    public boolean hasNext() {
        return start != sequence.size();
    }

    @Override
    public T next() {
        final T element = sequence.get(start);

        start++;

        return element;
    }
}
