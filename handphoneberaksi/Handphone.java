public class Handphone {
    Boolean statusAktif;
    String statusPanggilan, statusSMS;

    public Handphone() {
        this.statusAktif = false;
        this.statusPanggilan = "Menunggu";
        this.statusSMS = "Menunggu";
    }

    void setStatusAktif(Boolean status) {
        this.statusAktif = status;
        if (this.statusAktif) {
            System.out.println("Handphone menyala");
        } else {
            System.out.println("Handphone mati");
        }
    }

    void setStatusPanggilan(String status) {
        if (statusAktif == false) {
            System.out.println("Handphone mati, tidak dapat melakukan panggilan");
            return;
            
        }
        switch (status) {
            case "0":
                this.statusPanggilan = "Menunggu";
                break;
            case "1":
                this.statusPanggilan = "Menerima Panggilan";
                break;
            case "2":
                this.statusPanggilan = "Melakukan Panggilan";
                break;
            default:
                break;
        }
        System.out.println("Status Panggilan: " + this.statusPanggilan);
    }

    void setStatusSMS(String status) {
        if (statusAktif == false) {
            System.out.println("Handphone mati, tidak dapat melakukan panggilan");
            return;
            
        }
        switch (status) {
            case "0":
                this.statusSMS = "Menunggu";
                break;
            case "1":
                this.statusSMS = "Menerima SMS";
                break;
            case "2":
                this.statusSMS = "Mengirim SMS";
                break;
            default:
                break;
        }
        System.out.println("Status SMS: " + this.statusSMS);
    }

    void tampilSemuaStatus() {
        System.out.println("Status Handphone: " + (this.statusAktif ? "Menyala" : "Mati"));
        System.out.println("Status Panggilan: " + this.statusPanggilan);
        System.out.println("Status SMS: " + this.statusSMS);
    }
}
