import java.util.ArrayList;
import java.util.Iterator;

public class Sequence<T> extends ArrayList<T> {

    private final StmtIterator<T> iterator = new StmtIterator<>(this);

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }
}
