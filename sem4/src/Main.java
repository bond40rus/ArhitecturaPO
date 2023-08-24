import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ticket tick1 = new Ticket(1,10,37);
        //System.out.print(tick1.getRootNumber());
        Ticket tick2 = new Ticket(2,9);
        //System.out.print(tick2.getRootNumber());

        ArrayList<Ticket> ticks = new ArrayList<>();
        ticks.add(tick1);
        ticks.add(tick2);



        Customer cast1 = new Customer(ticks);
        System.out.println(cast1.getTickets());

    }
}