import java.util.Scanner;

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();

        try {
            System.out.println("Booking Validation");

            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            validator.validate(guestName, roomType, inventory);

            System.out.println("Booking successful!");
        } catch (InvalidBookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
