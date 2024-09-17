package hotel;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        StandardRoom room1 = new StandardRoom("101", 2, 2000,true);
        Suite suite1 = new Suite("901", 4, 3800,true);

        Customer customer1 = new Customer("Emilia", "0708403277");
        Customer customer2 = new Customer("Jonas", "+4561775550");

        bookingService.addRoom(room1);
        bookingService.addRoom(suite1);

        System.out.println("-----------------------------------------\n");

        System.out.println("Available rooms: ");
        bookingService.displayAvailableRooms();

        System.out.println("-----------------------------------------\n");

        System.out.println("Booking room " + room1.getRoomNr() + " for 3 nights" + "...");
        System.out.println("Price per night: " + room1.getPricePerNight() + "\nPrice for the stay: " + room1.calculatePrice(3));
        bookingService.bookRoom("101", customer1);
        //Get customer name for a specific room.
        System.out.println(room1.getCustomer().getName() + " has checked in.");
        System.out.println("-----------------------------------------\n");

        System.out.println("Trying to book room " + room1.getRoomNr() + "...");
        bookingService.bookRoom("101", customer1);
        System.out.println("-----------------------------------------\n");

        System.out.println("Cancelling reservation for room " + room1.getRoomNr() + "...");
        bookingService.cancelBooking("101");
        System.out.println("-----------------------------------------\n");
    }
}
