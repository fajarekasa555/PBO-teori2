package bank;

public class BankTest {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("Budi", "1234567890", 1000000);
        tabungan.cekSaldo();
        tabungan.simpanUang(500000);
        tabungan.ambilUang(200000);
        tabungan.ambilUang(2000000);
        tabungan.cekSaldo();
    }
    
}
