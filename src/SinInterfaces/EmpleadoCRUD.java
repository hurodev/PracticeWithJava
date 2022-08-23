package SinInterfaces;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    private List<Empleado> empleados = new ArrayList<Empleado>();



    // save empleado CREATE
    public void guardar(Empleado empleado){

        empleados.add(empleado);



    }

    List<Empleado> findEmpleados(){
        return empleados;
    }


}
