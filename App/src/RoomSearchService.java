import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        // Single Room
        if (availability.getOrDefault("Single", 0) > 0) {
            System.out.println("Single Room:");
            System.out.println("Beds: " + singleRoom.beds);
            System.out.println("Size: " + singleRoom.size + " sqft");
            System.out.println("Price per night: " + singleRoom.price);
            System.out.println("Available Rooms: " + availability.get("Single"));
            System.out.println();
        }

        // Double Room
        if (availability.getOrDefault("Double", 0) > 0) {
            System.out.println("Double Room:");
            System.out.println("Beds: " + doubleRoom.beds);
            System.out.println("Size: " + doubleRoom.size + " sqft");
            System.out.println("Price per night: " + doubleRoom.price);
            System.out.println("Available Rooms: " + availability.get("Double"));
            System.out.println();
        }

        // Suite Room
        if (availability.getOrDefault("Suite", 0) > 0) {
            System.out.println("Suite Room:");
            System.out.println("Beds: " + suiteRoom.beds);
            System.out.println("Size: " + suiteRoom.size + " sqft");
            System.out.println("Price per night: " + suiteRoom.price);
            System.out.println("Available Rooms: " + availability.get("Suite"));
            System.out.println();
        }
    }
}