package com.company;

public class PcMuhendisi implements IMuhendis,IPersonel {
    private String isim;
    private boolean is_askerlik;
    private boolean is_sabıkalı;

    PcMuhendisi() {
        this.is_askerlik = false;
        this.is_sabıkalı = false;
    }

    PcMuhendisi(String  isim,boolean is_askerlik, boolean is_sabıkalı) {
        this.is_askerlik = is_askerlik;
        this.is_sabıkalı = isIs_sabıkalı();
        this.isim=isim;
    }

    @Override
    public void minumunMaas() {
        System.out.println("Minimun maas 30000");
    }

    @Override
    public void askerlikDurumu() {
        if(this.is_askerlik){
            System.out.println( this.isim + " askerligini yaptı.");
        }
        else {
            System.out.println( this.isim + " askerligini yapmadı.");
        }

    }

    @Override
    public String mezuniyetOrtalaması(double ortala) {
       String ortalama=ortala+"";
        return ortalama;
    }

    @Override
    public void adliSicilDurumu() {
     if(this.is_sabıkalı){
         System.out.println(this.isim + " in sabıkası var" );
     }
     else{
         System.out.println(this.isim + " in sabıkası yok");
     }
    }

    @Override
    public void isTecrubesi(String[] istecrubesi) {
        System.out.println(this.isim + " in iş tecrubesi aşagıdaki gibiidir");
        for (String value:istecrubesi ) {
            System.out.print(value + " , ");
        }
    }

    @Override
    public void bildigiDiller() {
        System.out.println("Java");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isIs_askerlik() {
        return is_askerlik;
    }

    public void setIs_askerlik(boolean is_askerlik) {
        this.is_askerlik = is_askerlik;
    }

    public boolean isIs_sabıkalı() {
        return is_sabıkalı;
    }

    public void setIs_sabıkalı(boolean is_sabıkalı) {
        this.is_sabıkalı = is_sabıkalı;
    }
}
