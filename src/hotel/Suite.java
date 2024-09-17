package hotel;

public class Suite extends Room {

    private boolean hasJacuzzi;

    public Suite(String roomNr, int capacity, int pricePerNight, boolean hasJacuzzi) {
        super(roomNr, capacity, pricePerNight);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void displayRoom() {
        System.out.println("Standard Room with nr " + getRoomNr() + " and capacity of " + getCapacity() + " guests. Jacuzzi: " + (hasJacuzzi ? "Ja" : "Nej"));
    }
}
