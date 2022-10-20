package com.company;

public class Hayvan {
    private String name, sound, info, infoText;

    public Hayvan() {

    }

    public Hayvan(String name, String sound, String info, String infoText) {
        this.name = name;
        this.sound = sound;
        this.info = info;
        this.infoText = infoText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }
}
