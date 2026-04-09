public class UseCase10BookingCancellation {

    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        CancellationService service = new CancellationService();

        System.out.println("Booking Cancellation");

        String reservationId = "Single-1";
        service.registerBooking(reservationId, "Single");
        service.cancelBooking(reservationId, inventory);
        service.showRollbackHistory();

        System.out.println("\nUpdated Single Room Availability: "
                + inventory.getAvailability("Single"));
    }
}
