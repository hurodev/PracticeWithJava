package OpenBootCamp;

import Herencia.SmartPhone;
import Herencia.SmartWatch;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //obj 1
        SmartPhone s22 = new SmartPhone("samsung", "s22", "silver", "256gbgb ","snapdragon 888","8px","jbl;");
        // obj 2
        SmartWatch watch3 = new SmartWatch("watch2", "watch3", "black", "black", "black", "black","giratorio");
        //obj 34
        SmartWatch watch4 = new SmartWatch();
        watch4.marca = "smsung";
        watch4.modelo = "clasic";
        watch4.color = "black";
        watch4.memoria = "16gb";
        watch4.correa = "cuero";
        watch4.bizel = "black";
        watch4.procesador = "exinos";



        System.out.println(s22);

        System.out.println(watch4);

        System.out.println(watch3);





    }
}