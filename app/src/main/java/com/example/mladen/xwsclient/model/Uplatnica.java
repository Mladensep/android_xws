package com.example.mladen.xwsclient.model;


public class Uplatnica {
    //private int id;
    private String DuznikNalogodavac;
    private String SvrhaPlacanja;
    private String PoverilacPrimalac;
    private String MestoDatumPrijema;
    private String SifraPlacanja;
    private int Cena;
    private String RacunDuznikaNalogodavca;
    private String Model;
    private String PozivNaBrojZaduzenja;
    private String RecunPoveriocaPrimaoca;
    private String Model2;
    private String RacunNaBrojOdobrenje;
    private String DatumValute;
    private boolean Checkbox;

    public Uplatnica() {}

    public int getCena() {
        return Cena;
    }

    public void setCena(int cena) {
        Cena = cena;
    }

    public String getDuznikNalogodavac() {
        return DuznikNalogodavac;
    }

    public void setDuznikNalogodavac(String duznikNalogodavac) {
        DuznikNalogodavac = duznikNalogodavac;
    }

    public String getSvrhaPlacanja() {
        return SvrhaPlacanja;
    }

    public void setSvrhaPlacanja(String svrhaPlacanja) {
        SvrhaPlacanja = svrhaPlacanja;
    }

    public String getPoverilacPrimalac() {
        return PoverilacPrimalac;
    }

    public void setPoverilacPrimalac(String poverilacPrimalac) {
        PoverilacPrimalac = poverilacPrimalac;
    }

    public String getMestoDatumPrijema() {
        return MestoDatumPrijema;
    }

    public void setMestoDatumPrijema(String mestoDatumPrijema) {
        MestoDatumPrijema = mestoDatumPrijema;
    }

    public String getSifraPlacanja() {
        return SifraPlacanja;
    }

    public void setSifraPlacanja(String sifraPlacanja) {
        SifraPlacanja = sifraPlacanja;
    }

    public String getRacunDuznikaNalogodavca() {
        return RacunDuznikaNalogodavca;
    }

    public void setRacunDuznikaNalogodavca(String racunDuznikaNalogodavca) {
        RacunDuznikaNalogodavca = racunDuznikaNalogodavca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getPozivNaBrojZaduzenja() {
        return PozivNaBrojZaduzenja;
    }

    public void setPozivNaBrojZaduzenja(String pozivNaBrojZaduzenja) {
        PozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
    }

    public String getRecunPoveriocaPrimaoca() {
        return RecunPoveriocaPrimaoca;
    }

    public void setRecunPoveriocaPrimaoca(String recunPoveriocaPrimaoca) {
        RecunPoveriocaPrimaoca = recunPoveriocaPrimaoca;
    }

    public String getModel2() {
        return Model2;
    }

    public void setModel2(String model2) {
        Model2 = model2;
    }

    public String getRacunNaBrojOdobrenje() {
        return RacunNaBrojOdobrenje;
    }

    public void setRacunNaBrojOdobrenje(String racunNaBrojOdobrenje) {
        RacunNaBrojOdobrenje = racunNaBrojOdobrenje;
    }

    public String getDatumValute() {
        return DatumValute;
    }

    public void setDatumValute(String datumValute) {
        DatumValute = datumValute;
    }

    public boolean isCheckbox() {
        return Checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        Checkbox = checkbox;
    }
}
