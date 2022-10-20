package com.company;

public class Main {

    public static void main(String[] args) {
        Anakart anakart = new Anakart("Asus Prime", "Asus", 4);
        anakart.showInfo();
        System.out.println("**********");
        Monitor monitor = new Monitor("HP monitor", "HP", "20");
        monitor.showInfo();
        System.out.println("**********");
        Kasa kasa = new Kasa("kasa model","Monster","metal");
        kasa.showInfo();
        System.out.println("**********");
        Bilgisayar bilgisayar = new Bilgisayar(kasa,anakart,monitor);
        System.out.println(bilgisayar.getAnakart().getModel());
        System.out.println(bilgisayar.getKasa().getUretici());
        System.out.println(bilgisayar.getMonitor().getModel());



    }
}
