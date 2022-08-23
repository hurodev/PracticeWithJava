package OpenBootCamp;

public class SmartDevice {


        protected String marca;
        protected String modelo;
        protected String color;
        protected String memoria;

        protected String procesador;




    public SmartDevice(String marca, String modelo, String color, String memoria,String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.memoria = memoria;
        this.procesador = procesador;

    }

    public SmartDevice() {

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", memoria='" + memoria + '\'' +
                ", procesador='" + procesador + '\'' +
                '}';
    }
}
