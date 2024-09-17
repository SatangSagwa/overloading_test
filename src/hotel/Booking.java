package hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Room room;
    private Customer customer;

    public Booking(LocalDate checkInDate, LocalDate checkOutDate, Room room, Customer customer) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.customer = customer;
    }

    public void ShowDetails() {
        System.out.println("Booking Details");
        System.out.println("Room No. " + this.room.getRoomNr());
        System.out.println("Customer name: " + this.customer.getName());
        System.out.println("Check In Date: " + this.checkInDate);
        System.out.println("Check Out Date: " + this.checkOutDate);
    }

    public int getTotalDays() {
        long difference = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return (int) difference;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
