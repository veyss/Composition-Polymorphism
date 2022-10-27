package com.company;

public class Main {

    public static void main(String[] args) {
        PcMuhendisi adil = new PcMuhendisi("Adil", true, false);

        adil.askerlikDurumu();
        adil.adliSicilDurumu();
        String ortalama = adil.mezuniyetOrtalaması(3.8);
        System.out.println(adil.getIsim() + " in mezuniyet ortalamssı = " + ortalama);
        /*
        String [] tecrube = new String[3];
        tecrube[0]="Trendyol";
        tecrube[1] ="Google";
        tecrube[2]="Amazon";
        */
         String tecrube[] ={"Trendyol","Google","Amazon"};
        adil.isTecrubesi(tecrube);
        System.out.println();
        YazılımMuhendisi seyma = new YazılımMuhendisi();
        seyma.showInfo();

    }
}
