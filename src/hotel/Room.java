package hotel;

public class Room {

    //Instansvariabler
    private String roomNr;
    private int capacity;
    private boolean isBooked;

    //Konstruktor med parametrar
    public Room(String roomNr, int capacity) {
        this.roomNr = roomNr; //this refererar till klassen/instansvariabler
        this.capacity = capacity;
        this.isBooked = false;
    }

    public String getRoomNr() {
        return roomNr;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //Metod för att boka
    public void bookRoom() {
        if (isBooked) {
            System.out.println("Room " + roomNr + " is already booked");
        } else {
            isBooked = true;
            System.out.println("Room " + roomNr + " is booked");
        }
    }
    //Metod för att avboka
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("The reservation for room " + roomNr + " has been cancelled");
        } else {
            System.out.println("The reservation for room " + roomNr + " is not booked");
        }
    }

    //Metod för att visa detaljer

    //"@override" = Annotation/anteckning för överskriden metod
    /*@Override
    public String toString() {
        return "Room{" +
                "roomNr='" + roomNr + '\'' +
                ", capacity=" + capacity +
                ", isBooked=" + isBooked +
                '}';
    }*/

    public void displayRoom() {
        System.out.println("Room " + roomNr + " with capacity of " + capacity + " guests");
    }
}
