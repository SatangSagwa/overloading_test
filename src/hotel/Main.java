package hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        StandardRoom room1 = new StandardRoom("101", 2, 2000,true);
        Suite suite1 = new Suite("901", 4, 3800,true);

        Customer customer1 = new Customer("Emilia", "0708403277");
        Customer customer2 = new Customer("Jonas", "+4561775550");

        LocalDate date1 = LocalDate.of(2024, 10, 22);
        LocalDate date2 = LocalDate.of(2024, 12, 3);
        Booking booking1 = new Booking(date1, date2, room1, customer1);


        bookingService.addRoom(room1);
        bookingService.addRoom(suite1);

        System.out.println("-----------------------------------------\n");

        System.out.println("Available rooms: ");
        bookingService.displayAvailableRooms();

        System.out.println("-----------------------------------------\n");


        System.out.println("Booking room " + booking1.getRoom().getRoomNr() + " from " + booking1.getCheckInDate() + " to " + booking1.getCheckOutDate() + "...");
        System.out.println("Duration of stay: " + booking1.getTotalDays() + " nights.");
        System.out.println("Price per night: " + booking1.getRoom().getPricePerNight() + "\nPrice for the stay: " + booking1.getRoom().calculatePrice(3));
        bookingService.bookRoom(booking1);
        //Get customer name for a specific room.
        System.out.println(room1.getCustomer().getName() + " has checked in.");
        System.out.println("-----------------------------------------\n");

        System.out.println("Trying to book room " + room1.getRoomNr() + "...");
        bookingService.bookRoom(booking1);
        System.out.println("-----------------------------------------\n");

        System.out.println("Cancelling reservation for room " + room1.getRoomNr() + "...");
        bookingService.cancelBooking("101");
        System.out.println("-----------------------------------------\n");
    }
}
