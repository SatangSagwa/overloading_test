package hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    //lista med alla rum
    private List<Room> rooms = new ArrayList<Room>();

    //Metod för att lägga till rum i listan
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.getRoomNr() + " has been added to the system.");
    }

    //Metod för att boka ett rum baserat på rumsnummer
    public void bookRoom(String roomNr, Customer customer) {
        Room room = findRoom(roomNr);
        if (!room.isBooked()) {
            room.bookRoom(customer);

        } else {
            System.out.println("Room " + room.getRoomNr() + " was not found.");
        }
    }
    //Metod för att avboka baserat på rumsnummer
    public void cancelBooking(String roomNr) {
        Room room = findRoom(roomNr);
        if (room != null) {
            room.cancelBooking();
        } else {
            System.out.println("Room " + room.getRoomNr() + " was not found. \nAre you sure it has been booked?");
        }
    }

    //Metod för att visa tillgängliga rum
    public void displayAvailableRooms() {
        //for each - for each room in rooms
        for (Room room : rooms) {
            room.displayRoom();
        }
    }

    //Hitta ett rum baserat på rumsnummer, ska vara privat (endast för bookingservice)
    private Room findRoom(String roomNr) {
        for (Room room : rooms) {
            if (room.getRoomNr().equals(roomNr)) {
                return room;
            } else {
                System.out.println("Room " + room.getRoomNr() + " was not found.");
            }
        }   return null;
    }
}
