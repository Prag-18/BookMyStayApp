import java.util.LinkedList;
import java.util.Queue;

public class UseCase6RoomAllocation {

    public static void main(String[] args) {
        RoomAllocationService service = new RoomAllocationService();
        RoomInventory inventory = new RoomInventory();

        // FIFO Queue
        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("Abhi", "Single"));
        queue.add(new Reservation("Subha", "Single"));
        queue.add(new Reservation("Vanamthi", "Suite"));

        System.out.println("Room Allocation Processing:");

        while (!queue.isEmpty()) {
            Reservation r = queue.poll();
            service.allocateRoom(r, inventory);
        }
    }
}
