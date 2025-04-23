import java.util.Date;

public class BookingInfo {
    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private Date checkin;
    private Date checkout;
    private boolean statusAktif;
    private String kodeVoucher;
    private boolean sudahDibayar;

    public BookingInfo(String jenisKamar, int jumlahTamu, int jumlahMalam,
                       double hargaPerMalam, Date checkin, Date checkout,
                       boolean statusAktif, String kodeVoucher, boolean sudahDibayar) {
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.checkin = checkin;
        this.checkout = checkout;
        this.statusAktif = statusAktif;
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
    }

    public double hitungTotalBiaya() {
        double total = hargaPerMalam * jumlahMalam;
        if (jumlahTamu > 2) total += (jumlahTamu - 2) * 100_000;
        if (kodeVoucher != null && kodeVoucher.length() > 3) total -= 50_000;
        if (!statusAktif) total = 0;
        return total;
    }

    public String klasifikasiTamu() {
        if (jumlahTamu == 1)
            return "Individu";
        else if (jumlahTamu == 2)
            return "Pasangan";
        else
            return "Keluarga";
    }
    
    public String getJenisKamar() { return jenisKamar; }
    public int getJumlahTamu() { return jumlahTamu; }
    public int getJumlahMalam() { return jumlahMalam; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public Date getCheckin() { return checkin; }
    public Date getCheckout() { return checkout; }
    public boolean isStatusAktif() { return statusAktif; }
    public String getKodeVoucher() { return kodeVoucher; }
    public boolean isSudahDibayar() { return sudahDibayar; }
}