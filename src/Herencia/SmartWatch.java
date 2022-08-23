package Herencia;

import OpenBootCamp.SmartDevice;

public class SmartWatch extends SmartDevice {

     public String correa;
     public String bizel;



    public SmartWatch(){

    }


    public SmartWatch(String marca, String modelo, String color, String memoria, String procesador, String correa, String bizel) {
        super(marca, modelo, color, memoria, procesador);
        this.correa = correa;
        bizel = bizel;
    }



}


