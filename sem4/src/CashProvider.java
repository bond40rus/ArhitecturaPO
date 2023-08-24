public class CashProvider {
    public long card;
    public long hashCard;
    public boolean isAutorization = false;

    public void authorization() {
        isAutorization = true;
    }

    public boolean buy(Ticket ticket) {
        if (isAutorization) {
            return true;
        }
        return false;
    }




}
