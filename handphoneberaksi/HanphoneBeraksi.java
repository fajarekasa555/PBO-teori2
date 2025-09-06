public class HanphoneBeraksi {

    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setStatusAktif(true);
        hp.setStatusPanggilan("1");
        hp.setStatusSMS("2");
        hp.tampilSemuaStatus();
    }
}