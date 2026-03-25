import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private final Map<String, Room> roomInventory;

    public RoomInventory() {
        roomInventory = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomInventory.put("Single", new Room(1, 250, 1500.0, 5));
        roomInventory.put("Double", new Room(2, 400, 2500.0, 3));
        roomInventory.put("Suite", new Room(3, 750, 5000.0, 2));
    }

    public int getAvailability(String roomType) {
        return roomInventory.containsKey(roomType)
                ? roomInventory.get(roomType).available
                : 0;
    }

    public void updateAvailability(String roomType, int count) {
        if (roomInventory.containsKey(roomType)) {
            roomInventory.get(roomType).available = count;
        }
    }

    public void displayInventory() {
        System.out.println("Hotel Room Inventory Status\n");

        for (Map.Entry<String, Room> entry : roomInventory.entrySet()) {
            String type = entry.getKey();
            Room room = entry.getValue();

            System.out.println(type + " Room:");
            System.out.println("Beds: " + room.beds);
            System.out.println("Size: " + room.size + " sqft");
            System.out.println("Price per night: " + room.price);
            System.out.println("Available Rooms: " + room.available);
            System.out.println();
        }
    }
}