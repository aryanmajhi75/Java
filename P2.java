import java.util.ArrayList;

final class Flight{
    private final int capacity;
    private final String category;

    public Flight(int capacity, String category) {
        this.capacity = capacity;
        this.category = category;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCategory() {
        return category;
    }
}

public class P2 {
    private static final int MAX_PASSENGER_COUNT = 100;
    private static ArrayList<Flight> flight = new ArrayList<>();
    private static int passengers = 0;

    static {
        passengers = 0;
    }

    public static void addSong(Song song) {
        if (passengers < MAX_PASSENGER_COUNT) {
            flight.add(song);
	    passengers=passengers+1;
        } else {
            System.out.println("Maximum passenger count reached. Cannot add more passengers.");
        }
    }

    public static void displaySongCount() {
	System.out.println("\n+------------------+");
        System.out.println("| Total passengers: " + passengers+" |");
	System.out.println("+------------------+\n");
    }

    public static void main(String[] args) {
        Flight p1 = new Flight (90, "ECONOMY");
        addSong(p1);

        Flight p2 = new Flight (100, "BUSINESS");
        addSong(p2);

        displaySongCount();
	
	System.out.println("\n+--------------------------------------------------------------------------------+");
        for (Flight flight : flights) {
            System.out.println("Passenger Category: " + flights.getCategory() + ", Passengers: " + flights.getCapacity());
	    System.out.println("\n+--------------------------------------------------------------------------------+");
        }
    }
}