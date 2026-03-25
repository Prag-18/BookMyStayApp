public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Create inventory
        RoomInventory inventory = new RoomInventory();

        // Create room detail objects (used by service)
        Room singleRoom = new Room(1, 250, 1500.0, 0);
        Room doubleRoom = new Room(2, 400, 2500.0, 0);
        Room suiteRoom = new Room(3, 750, 5000.0, 0);

        RoomSearchService service = new RoomSearchService();

        System.out.println("=== Available Rooms ===\n");
        service.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
        System.out.println("Available Single Rooms: "
                + inventory.getAvailability("Single"));
    }
}