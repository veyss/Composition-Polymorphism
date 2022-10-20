package com.company;

public class Main {
//overloading
    /*
    public void adınıGoster(Kopek kopek){
        System.out.println(kopek.getName());
    }
    public void adınıGoster(Kedi kedi){
        System.out.println(kedi.getName());
    }
    */
    public void  adınıGoster(Hayvan hayvan){
        System.out.println(hayvan.getName());
    }


    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("karabaş", "havla", "Golden", "Naciye nin kopeigi Golden");
        Kopek kopek = new Kopek("Boncuk", "havla", "Husky", "Bugra nin kopeigi Husky");
        Kedi kedi = new Kedi("kedicik", "miyav", "Ankara kedisi", "Seyman nin kedisi Ankaralı");

        //System.out.println(hayvan.getInfoText());
       // System.out.println(kopek.getInfoText());

        Hayvan kopek1 = new Kopek("anteris", "havla", "Pitbul", "Şeyma nin kopegi Pitbul");
        Hayvan kedi1 = new Kedi("apollo", "miyav", "van kedisi", "Adil nin kedisi Van");
       // Main.sesVer(kopek);
        Main main1= new Main();
        main1.adınıGoster(kopek);
        main1.adınıGoster(kedi);
        //Kopek hayvan2 = new Hayvan("anteris", "havla", "Pitbul", "Şeyma nin kopegi Pitbul");
    }
}
