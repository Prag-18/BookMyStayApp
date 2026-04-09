public class ReservationValidator {

    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        if (!roomType.equals("Single")
                && !roomType.equals("Double")
                && !roomType.equals("Suite")) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        if (!inventory.isAvailable(roomType)) {
            throw new InvalidBookingException("Room not available.");
        }
    }
}
