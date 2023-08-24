import java.util.Date;

public class Ticket {
    public Date date = new Date();
    public long rootNumber;
    public double price;
    public int place = -1;
    public boolean isValid = false;

    public Ticket(long rootNumber, double price, int place) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
    }

    public Ticket(int rootNumber, int price) {
        this.rootNumber = rootNumber;
        this.price = price;
    }


    public String getRootNumber() {
        String p = "Not place";
        if (place > 0) {
            p = "Place " +  Integer.toString(place);
        }
        return "Ticket № " + rootNumber + ", Date " + date + ", Price "+ price + " Rub, " + p + "\n";
    }

    public boolean setValid(boolean isValid) {
        this.isValid = isValid;
        return isValid;
    }



}
