package bank;

public class Tabungan {
    String namaPemilik, noRek;
    double saldo;

    public Tabungan(String namaPemilik, String noRek, double saldo) {
        this.namaPemilik = namaPemilik;
        this.noRek = noRek;
        this.saldo = saldo;
    }

    void cekSaldo() {
        System.out.println("Saldo Tabungan Anda Sejumlah : " + this.saldo);
    }

    void simpanUang(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Anda menyimpan uang sejumlah : " + jumlah);
        System.out.println("Saldo Tabungan Anda Sekarang : " + this.saldo);
    }

    void ambilUang(double jumlah) {
        if (this.saldo < jumlah) {
            System.out.println("Saldo Anda tidak mencukupi");
            return;
        }
        this.saldo -= jumlah;
        System.out.println("Anda mengambil uang sejumlah : " + jumlah);
        System.out.println("Saldo Tabungan Anda Sekarang : " + this.saldo);
    }
}
    