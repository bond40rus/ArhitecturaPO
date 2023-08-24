public class TicketProvider {
    public Ticket ticket;

    public boolean updateTicketStatus() {

        return ticket.setValid(true);
    }
}
