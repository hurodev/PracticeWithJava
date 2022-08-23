package SinInterfaces;

import java.util.List;

public class MainInter {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juanito = new Empleado("Juanito", 34, 34.500, true);
        Empleado David = new Empleado("David", 34, 34.500, true);
        Empleado natalia = new Empleado("nataloia", 34, 34.500, true);

        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(David);
        empleadoCRUD.guardar(natalia);

        System.out.println(David);

        List<Empleado> empleadosAll = empleadoCRUD.findEmpleados();

        System.out.println(empleadosAll.toString());


        EmpleadosMysql mysql = new EmpleadosMysql();
        mysql.findEmpleados();

    }
}