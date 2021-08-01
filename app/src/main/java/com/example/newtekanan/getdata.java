package com.example.newtekanan;

public class getdata {

    @Override
    public String toString() {
        return "getdata{" +
                "Tekanan='" + Tekanan + '\'' +
                ", Status='" + Status + '\'' +
                ", Pompa='" + Pompa + '\'' +
                ", Waktu='" + Waktu + '\'' +
                ", NO='" + Angka + '\'' +
                '}';
    }

    String Tekanan;
    String Status;
    String Pompa;
    String Waktu;
    String Angka;

    public String getAngka() {
        return Angka;
    }

    public void setAngka(String Angka) {
        Angka = Angka;
    }

    public getdata() {
    }



    public void setTekanan(String Tekanan) {
        Tekanan = Tekanan;
    }

    public void setStatus(String Status) {
        Status = Status;
    }

    public void setPompa(String Pompa) {
        Pompa = Pompa;
    }

    public void setWaktu(String Waktu) {
        Waktu = Waktu;
    }

    public getdata(String Tekanan, String Status, String Pompa, String Waktu, String Angka) {
        this.Tekanan = Tekanan;
        this.Status = Status;
        this.Pompa = Pompa;
        this.Waktu = Waktu;
        this.Angka = Angka;
    }

    public String getTekanan() {
        return Tekanan;
    }

    public String getStatus() {
        return Status;
    }

    public String getPompa() {
        return Pompa;
    }

    public String getWaktu() {
        return Waktu;
    }
}
