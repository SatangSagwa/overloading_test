package hotel;

public class Room {

    //Instansvariabler
    private String roomNr;
    private int capacity;
    private int pricePerNight;
    private boolean isBooked;
    private Customer customer;

    //Konstruktor med parametrar
    public Room(String roomNr, int capacity, int pricePerNight) {
        this.roomNr = roomNr; //this refererar till klassen/instansvariabler
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
        this.customer = null;
    }

    public Customer getCustomer() {
        return customer;
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

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    //Metod för att boka
    public void bookRoom(Customer customer) {
        if (isBooked) {
            System.out.println("Room " + roomNr + " is already booked");
        } else {
            isBooked = true;
            this.customer = customer;
            System.out.println("Room " + roomNr + " has been reserved");
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
    public void displayRoom() {
        System.out.println("Room " + roomNr + " with capacity of " + capacity + " guests");
    }

    public int calculatePrice(int nights) {
        return nights * pricePerNight;
    }


    //"@override" = Annotation/anteckning för överskriden metod
    /*@Override
    public String toString() {
        return "Room{" +
                "roomNr='" + roomNr + '\'' +
                ", capacity=" + capacity +
                ", isBooked=" + isBooked +
                '}';
    }*/

}
