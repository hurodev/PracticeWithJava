package EjercicioInterface;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImp();

    public static void main(String[] args) {


    cocheCrud.save();
    cocheCrud.delete();
    cocheCrud.find();





    }





}
