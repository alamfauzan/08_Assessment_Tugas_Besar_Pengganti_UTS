public class HotelRoomBooking {
    private Guest guest;
    private BookingInfo booking;

    public HotelRoomBooking(Guest guest, BookingInfo booking) {
        this.guest = guest;
        this.booking = booking;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println("Nama Pemesan : " + guest.getNama());
        System.out.println("Jenis Kelamin: " + guest.getJenisKelamin());
        System.out.println("No. KTP      : " + guest.getNomorKTP());
        System.out.println("Telepon      : " + guest.getNomorTelepon());
        System.out.println("Email        : " + guest.getEmail());
        System.out.println("Jenis Kamar  : " + booking.getJenisKamar());
        System.out.println("Jumlah Tamu  : " + booking.getJumlahTamu());
        System.out.println("Jumlah Malam : " + booking.getJumlahMalam());
        System.out.println("Harga/Malam  : " + booking.getHargaPerMalam());
        System.out.println("Check-in     : " + booking.getCheckin());
        System.out.println("Check-out    : " + booking.getCheckout());
        System.out.println("Status Aktif : " + booking.isStatusAktif());
        System.out.println("Voucher      : " + booking.getKodeVoucher());
        System.out.println("Sudah Dibayar: " + booking.isSudahDibayar());
        System.out.println("Total Biaya  : Rp " + booking.hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + booking.klasifikasiTamu());
        System.out.println("===================================");
    }
}