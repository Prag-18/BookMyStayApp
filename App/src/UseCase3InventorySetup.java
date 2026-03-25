public class UseCase3InventorySetup {

    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        inventory.displayInventory();
        System.out.println("Available Single Rooms: "
                + inventory.getAvailability("Single"));
        inventory.updateAvailability("Single", 8);
        inventory.updateAvailability("Suite", 1);
        System.out.println("\nAfter Updates:\n");
        inventory.displayInventory();
    }
}