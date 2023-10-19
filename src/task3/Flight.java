package task3;

import java.time.LocalDateTime;

public class Flight {
    private Airport departure;
    private Airport arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Flight(Airport departure, Airport arrival, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {

        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

}
