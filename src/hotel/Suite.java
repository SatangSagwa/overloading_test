package hotel;

public class Suite extends Room {

    private boolean hasJacuzzi;

    public Suite(String roomNr, int capacity, boolean hasJacuzzi) {
        super(roomNr, capacity);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void displayRoom() {
        System.out.println("Standard Room with nr " + getRoomNr() + " and capacity of " + getCapacity() + " guests. Jacuzzi: " + (hasJacuzzi ? "Ja" : "Nej"));
    }
}
