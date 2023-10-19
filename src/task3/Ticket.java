package task3;

public class Ticket {
    private Flight flight;
    private Passenger passenger;
    private int price;

    public Ticket(final Flight flight, final Passenger passenger, int price) {
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
