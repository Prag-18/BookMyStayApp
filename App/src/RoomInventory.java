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

    // ✅ Returns only availability (used by RoomSearchService)
    public Map<String, Integer> getRoomAvailability() {
        Map<String, Integer> availability = new HashMap<>();

        for (Map.Entry<String, Room> entry : roomInventory.entrySet()) {
            availability.put(entry.getKey(), entry.getValue().available);
        }

        return availability;
    }

    // ✅ Get availability of a specific room type
    public int getAvailability(String roomType) {
        return roomInventory.containsKey(roomType)
                ? roomInventory.get(roomType).available
                : 0;
    }

    // ✅ Update availability
    public void updateAvailability(String roomType, int count) {
        if (roomInventory.containsKey(roomType)) {
            roomInventory.get(roomType).available = count;
        }
    }

}