package com.company;

public class Kedi extends  Hayvan{
    public Kedi(){
        super();
    }
    public Kedi(String name, String sound, String info, String infoText){
        super(name,sound,info,infoText);
    }
   public void kediSesCıkar(){
       System.out.println(" Kedi ses cıkardı");
   }
}
