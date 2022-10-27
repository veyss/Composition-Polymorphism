package com.company;

public class YazılımMuhendisi extends Calısan{

    @Override
    public void mesaiSaati() {
        System.out.println("gunluk çalışma 8 saat");
    }

    @Override
    public void toplamCalısmaSaati() {
        super.toplamCalısmaSaati();
    }

    public void showInfo(){
       System.out.println("yazılım muhendisligine hosgeldiniz");
   }
}
