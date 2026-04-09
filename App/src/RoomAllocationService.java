import java.util.HashMap;
import java.util.Map;

public class RoomAllocationService {

    private Map<String, Integer> counters = new HashMap<>();

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {
        String type = reservation.getRoomType();

        if (!inventory.isAvailable(type)) {
            return;
        }

        int count = counters.getOrDefault(type, 0) + 1;
        counters.put(type, count);
        inventory.decrement(type);

        String roomId = type + "-" + count;

        System.out.println("Booking confirmed for Guest: "
                + reservation.getGuestName()
                + ", Room ID: " + roomId);
    }
}
