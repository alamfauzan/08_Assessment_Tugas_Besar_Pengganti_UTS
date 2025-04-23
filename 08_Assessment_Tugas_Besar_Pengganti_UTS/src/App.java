import java.util.Date;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Buat data tamu
        Guest tamu = new Guest(
            "Rizky Hidayat", 
            "1234567890123456", 
            "081234567890", 
            "rizky@example.com", 
            "Laki-laki"
        );

        // Set tanggal check-in dan check-out
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.MAY, 10); // 10 Mei 2025
        Date checkin = cal.getTime();

        cal.set(2025, Calendar.MAY, 12); // 12 Mei 2025
        Date checkout = cal.getTime();

        // Buat info booking
        BookingInfo info = new BookingInfo(
            3,                // jumlah tamu
            2,                // jumlah malam
            750000.0,         // harga per malam
            checkin, 
            checkout,
            "DISKON50",       // kode voucher
            true              // status aktif
        );

        // Buat booking
        HotelRoomBooking booking = new HotelRoomBooking(
            tamu,
            "Deluxe",
            info,
            true              // sudah dibayar
        );

        // Cetak detail
        booking.cetakDetailPemesanan();
    }
}
