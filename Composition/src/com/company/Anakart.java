package com.company;

public class Anakart {
    private String model;
    private String uretici;
    private int yuvaSayısı;

    public Anakart() {

    }

    public Anakart(String model, String uretici, int yuvaSayısı) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayısı = yuvaSayısı;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayısı() {
        return yuvaSayısı;
    }

    public void setYuvaSayısı(int yuvaSayısı) {
        this.yuvaSayısı = yuvaSayısı;
    }
    public void showInfo(){
        System.out.println("model = " + getModel());
        System.out.println("uretici = " + getUretici());
        System.out.println("yuva sayısı = " + getYuvaSayısı());
    }
}
