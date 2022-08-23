package ConInterfaces;

import SinInterfaces.Empleado;
import java.util.List;


public interface EmpleadoCRUD {


    //SE DECLARAN LOS METODOS NO SE IMPLEMENTAN

    //ACTUA COMO CONTRATO

    void save(Empleado empleado);

    List<Empleado> findEmpleados();

    void delete(Empleado empleado);

}
