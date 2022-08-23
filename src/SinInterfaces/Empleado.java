package SinInterfaces;

public class Empleado {


    // atributos
    String name;
    int edad;
    double salario;
    boolean alta;

    //constructor
    public Empleado(String name, int edad, double salario, boolean alta) {
        this.name = name;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    public Empleado(){

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
//metodos
}
