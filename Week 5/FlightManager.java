//Author Daniel Flesch
// Date: 02/13/24
// Manage and create flights from the flight class.
public class FlightManager {
        public static void main(String[] args)
        {
            Flight f1 = new Flight();
            f1.setFlightNumber("GBA619");
            f1.setDestination("Carribean");
            System.out.println("\n Flight Number: " + f1.getFlightNumber() + ", Destination: " + f1.getDestination() + "\n");

            Flight f2 = new Flight("XER551", "New York");
            System.out.println("\n Flight Number: " + f2.getFlightNumber() + ", Destination: " + f2.getDestination() + "\n");
        }
}