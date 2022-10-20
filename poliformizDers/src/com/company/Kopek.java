package com.company;

public class Kopek extends Hayvan {
    public Kopek(){
        super();
    }
    public Kopek(String name, String sound, String info, String infoText){
        super(name,sound,info,infoText);
    }
   public void sesCıkar(){
       System.out.println("kopek havladı");
   }
}
