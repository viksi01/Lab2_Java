package task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Airline {
    private final List<Airport> airports = new ArrayList<>();
    private final List<Plane> planes = new ArrayList<>();
    private final List<Flight> flights = new ArrayList<>();
    private final List<Passenger> passengers = new ArrayList<>();
    private final List<Ticket> tickets = new ArrayList<>();

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public void removeAirport(Airport airport) {
        airports.remove(airport);
    }

    public void editAirport(final Airport airport, String city) {
        airport.setCity(city);
    }
    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(Plane plane) {
        planes.remove(plane);
    }

    public void editPlane(final Plane plane, int capacity) {
        plane.setCapacity(capacity);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void editFlight(final Flight flight, LocalDateTime departureTime,
                           LocalDateTime arrivalTime) {
        flight.setDepartureTime(departureTime);
        flight.setArrivalTime(arrivalTime);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public void editPassenger(final Passenger passenger, final String firstName, final String lastName) {
        passenger.setFirstName(firstName);
        passenger.setLastName(lastName);
    }
    public void ticketPurchase(Ticket ticket, Plane plane) {
        if (plane.getCapacity() == tickets.size()) {
            System.out.println("Plane is full");
            return;
        }
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }


    public int income(LocalDate begin, LocalDate end) {
        int income = 0;
        for (Flight flight : flights) {
            if((flight.getDepartureTime().toLocalDate().isAfter(begin)) &&
                    (flight.getDepartureTime().toLocalDate().isBefore(end))) {
                for (Ticket ticket : tickets) {
                    if (ticket.getFlight().equals(flight)) {
                        income += ticket.getPrice();
                    }
                }
            }
        }

        return income;
    }
    public void flightSchedule(){
        System.out.println("Flights:");
        for (Flight flight : flights) {
            System.out.println("Departure: " + flight.getDeparture().getCity() + " " + "at" + " " + flight.getDepartureTime() + " "
                    + "Ariving: " + flight.getArrival().getCity() + " " +  "at" + " " + flight.getArrivalTime());
        }

    }

}
