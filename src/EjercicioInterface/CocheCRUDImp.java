package EjercicioInterface;


public class CocheCRUDImp implements CocheCRUD  {





    @Override
    public void save() {
        System.out.println("guardando coche");

    }

    @Override
    public void delete() {
        System.out.println("eliminando coche");


    }

    @Override
    public void find() {
        System.out.println("encontrando coche");


    }

    public CocheCRUDImp() {
    }
}
