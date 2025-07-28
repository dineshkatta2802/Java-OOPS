import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    private String eventName;
    private int availableSeats;
    private double ticketPrice;

    public Event(String eventName, int availableSeats, double ticketPrice) {
        this.eventName = eventName;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void bookSeats(int numSeats) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            System.out.println("Booking successful!");
        } else {
            System.out.println("Sorry, not enough seats available.");
        }
    }
}

public class TicketBookingSystem {
    private List<Event> events;

    public TicketBookingSystem() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void displayEvents() {
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            System.out.println((i + 1) + ". " + event.getEventName() +
                    " - Available Seats: " + event.getAvailableSeats() +
                    ", Ticket Price: $" + event.getTicketPrice());
        }
    }

    public void bookTickets(int eventIndex, int numSeats) {
        Event event = events.get(eventIndex);
        event.bookSeats(numSeats);
    }

    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();

        // Adding sample events
        ticketBookingSystem.addEvent(new Event("Concert", 100, 50.0));
        ticketBookingSystem.addEvent(new Event("Movie", 50, 10.0));
        ticketBookingSystem.addEvent(new Event("Sports Match", 200, 30.0));

        Scanner scanner = new Scanner(System.in);

        // Display available events
        System.out.println("Available Events:");
        ticketBookingSystem.displayEvents();

        // Prompt user to select an event
        System.out.print("Enter the event number to book tickets: ");
        int eventIndex = scanner.nextInt() - 1;

        // Prompt user to enter the number of seats to book
        System.out.print("Enter the number of seats to book: ");
        int numSeats = scanner.nextInt();

        // Book tickets
        ticketBookingSystem.bookTickets(eventIndex, numSeats);

        // Display updated available seats
        System.out.println("Updated Available Seats:");
        ticketBookingSystem.displayEvents();

        scanner.close();
    }
}
