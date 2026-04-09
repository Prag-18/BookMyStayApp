public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {
        String filePath = "inventory.txt";
        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        System.out.println("System Recovery");

        persistenceService.loadInventory(inventory, filePath);
        inventory.display();
        persistenceService.saveInventory(inventory, filePath);
    }
}
