package task3;

public class Ticket {
    private Flight flight;
    private Passenger passenger;
    private int price;


    public Ticket(final Flight flight, final Passenger passenger, final int price) {
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(final Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(final Passenger passenger) {
        this.passenger = passenger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }


}
