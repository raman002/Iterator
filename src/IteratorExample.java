import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Sequence<Stmt> sequence = new Sequence();

        Stmt stmt1 = new Stmt();
        stmt1.setValue("Sanket");

        Stmt stmt2 = new Stmt();
        stmt2.setValue("Raman");

        Stmt stmt3 = new Stmt();
        stmt3.setValue("Sumit");

        sequence.add(stmt1);
        sequence.add(stmt2);
        sequence.add(stmt3);

        final Iterator<Stmt> iterator = sequence.iterator();

        while(iterator.hasNext()) {
            System.out.println("Name = " + iterator.next().text());
        }

    }
}
