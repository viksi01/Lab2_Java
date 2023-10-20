package task3;

import java.time.LocalDateTime;

public class Flight {
    private Airport departure;
    private Airport arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Flight(final Airport departure, final Airport arrival, final LocalDateTime departureTime, final LocalDateTime arrivalTime) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(final LocalDateTime departureTime) {

        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(final LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(final Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(final Airport arrival) {
        this.arrival = arrival;
    }

}
