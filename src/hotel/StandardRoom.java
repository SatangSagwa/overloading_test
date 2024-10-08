package hotel;

public class StandardRoom extends Room {
    //Underklass, arv från Room
    private boolean hasTV;

    public StandardRoom(String roomNr, int capacity, int pricePerNight, boolean hasTV) {
        super(roomNr, capacity, pricePerNight); //super-klassen anropar konstruktorn från basklassen
        this.hasTV = hasTV;
    }

    @Override
    public void displayRoom() {
        System.out.println("Standard Room with nr " + getRoomNr() + " and capacity of " + getCapacity() + " guests. Tv: " + (hasTV ? "Ja" : "Nej"));
    }
}
