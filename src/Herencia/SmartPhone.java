package Herencia;

import OpenBootCamp.SmartDevice;

public class SmartPhone extends SmartDevice {


        String camera;
        String audio;


    public SmartPhone(String marca, String modelo, String color, String memoria, String procesador, String camera, String audio) {
        super(marca, modelo, color, memoria, procesador);
        this.camera = camera;
        this.audio = audio;
    }
    public SmartPhone(){

    }






}
