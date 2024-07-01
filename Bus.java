public class Bus {
    public static void main(String[] args) {
       
        String busName = "City Express";
        int busNumber = 5678;
        String departureStation = "Town A";
        String arrivalStation = "Town B";
        String departureTime = "8:00 AM";
        String arrivalTime = "11:00 AM";
        String seatNumber = "B2";
        String passengerName = "Jane Doe";
        double ticketPrice = 90.0; 
        String journeyDate = "2024-07-01";

        
        if (ticketPrice < 100) {
            System.out.println("Ticket Price: " + ticketPrice);
            System.out.println("From: " + departureStation);
        } else {
            System.out.println("Ticket Price is not less than 100. Current Price: " + ticketPrice);
        }
    }
}