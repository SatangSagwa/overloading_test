package hotel;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        StandardRoom room1 = new StandardRoom("101", 2, true);
        Suite suite1 = new Suite("901", 4, true);

        bookingService.addRoom(room1);
        bookingService.addRoom(suite1);

        System.out.println("-----------------------------------------\n");

        System.out.println("Available rooms: ");
        bookingService.displayAvailableRooms();

        System.out.println("-----------------------------------------\n");

        System.out.println("Bokar rum " + room1.getRoomNr() + ":");
        bookingService.bookRoom("101");
        System.out.println("-----------------------------------------\n");

        System.out.println("Försöker boka 101 igen");
        bookingService.bookRoom("101");
        System.out.println("-----------------------------------------\n");

        System.out.println("Avbokar rum 101: ");
        bookingService.cancelBooking("101");
        System.out.println("-----------------------------------------\n");
        
    }
}
