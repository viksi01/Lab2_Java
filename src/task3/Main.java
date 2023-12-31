package task3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(final String[] args) {

        final Airport airport1 = new Airport("Lviv");
        final Airport airport2 = new Airport("Paris");
        final Airport airport3 = new Airport("Kyiv");

        final Plane plane1 = new Plane(100);
        final Plane plane2 = new Plane(200);

        final LocalDateTime departureTime1 = LocalDateTime.of(2022, 4, 1, 13, 0);
        final LocalDateTime arrivalTime1 = LocalDateTime.of(2022, 4, 2, 2, 12);
        final LocalDateTime departureTime2 = LocalDateTime.of(2020, 10, 12, 21, 30);
        final LocalDateTime arrivalTime2 = LocalDateTime.of(2020, 10, 13, 12, 0);

        final Flight flight1 = new Flight(airport1, airport2, departureTime1, arrivalTime1);
        final Flight flight2 = new Flight(airport2, airport3, departureTime2, arrivalTime2);

        final Passenger passenger1 = new Passenger("John", "Smith");
        final Passenger passenger2 = new Passenger("Will", "Smith");

        final Ticket ticket1 = new Ticket(flight1, passenger1, 200);
        final Ticket ticket2 = new Ticket(flight2, passenger2, 300);


        final Airline airline = new Airline();
        airline.addAirport(airport1);
        airline.addAirport(airport2);
        airline.addAirport(airport3);
        airline.addPlane(plane1);
        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addPassenger(passenger1);
        airline.addPassenger(passenger2);
        airline.ticketPurchase(ticket1,plane1);
        airline.ticketPurchase(ticket2,plane2);


        final LocalDate begin = LocalDate.of(2021, 1, 1);
        final LocalDate end = LocalDate.of(2023, 12, 10);

        airline.income(begin, end);
        airline.flightSchedule();


    }
}