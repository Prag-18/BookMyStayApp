public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {
        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();

        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanamthi", "Suite"));

        System.out.println("Booking History and Reporting");
        reportService.generateReport(history);
    }
}
