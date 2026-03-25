abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

public class UC2 {
    public static void main(String[] args) {

        System.out.println("Single Room:");
        Room single = new SingleRoom();
        single.displayRoomDetails();
        System.out.println("Available: 5\n");

        System.out.println("Double Room:");
        Room dbl = new DoubleRoom();
        dbl.displayRoomDetails();
        System.out.println("Available: 3\n");

        System.out.println("Suite Room:");
        Room suite = new SuiteRoom();
        suite.displayRoomDetails();
        System.out.println("Available: 2");
    }
}