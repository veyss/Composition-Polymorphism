package com.company;

public class Monitor {
    private String model;
    private String uretici;
    private String boyut;

    public Monitor() {

    }

    public Monitor(String model, String uretici, String boyut) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void showInfo(){
        System.out.println("model = " + getModel());
        System.out.println("uretici = " + getUretici());
        System.out.println("Boyut = " + getBoyut());
    }
}
