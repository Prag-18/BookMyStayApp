import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CancellationService {

    private Stack<String> cancellationStack;
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        cancellationStack = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    public void cancelBooking(String reservationId, RoomInventory inventory) {
        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Invalid cancellation: Reservation not found.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);
        inventory.increment(roomType);
        cancellationStack.push(reservationId);
        reservationRoomTypeMap.remove(reservationId);

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
    }

    public void showRollbackHistory() {
        System.out.println("\nRollback History (Most Recent First):");

        for (int i = cancellationStack.size() - 1; i >= 0; i--) {
            System.out.println("Released Reservation ID: " + cancellationStack.get(i));
        }
    }
}
