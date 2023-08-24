
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Customer {
    public int id;
    public List<Ticket> tickets;
    public CashProvider cash;
    public TicketProvider ticketProvider;

    public Customer(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
        cash = new CashProvider();

    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public boolean buyTicket(Ticket ticket) throws RuntimeException {
        boolean flag;
        cash.authorization();
        flag = cash.buy(ticket);
        if (flag) {
            flag = ticketProvider.updateTicketStatus();
        }
        return flag;
    }

    public List<Ticket> searchTicket(Date date, int route) throws RuntimeException {
        List<Ticket> result = new ArrayList<>();

        for (Ticket ticket : result) {
            if (ticket.date.equals(date)) {
                result.add(ticket);
            }
        }
        if (result.isEmpty()) {
            throw new RuntimeException("There are no tickets for this date");
        }
        return result;
    }
}
