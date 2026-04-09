import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilePersistenceService {

    public void saveInventory(RoomInventory inventory, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, Integer> entry : inventory.getInventory().entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }

            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving inventory.");
        }
    }

    public void loadInventory(RoomInventory inventory, String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Map<String, Integer> loadedData = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");

                if (parts.length == 2) {
                    loadedData.put(parts[0], Integer.parseInt(parts[1]));
                }
            }

            inventory.setInventory(loadedData);
        } catch (Exception e) {
            System.out.println("Error loading inventory. Starting fresh.");
        }
    }
}
