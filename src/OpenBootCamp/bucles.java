package OpenBootCamp;

public class bucles {
    public static void main(String[] args) {
        String usuario1 = "Hugo";
        String usuario2 = "Pedro";
        String usuario3 = "Lalo";
        String usuario4 = "Fernando";
        String usuario5 = "Natalia";
        String allNames = "";


        String[] names = new String[]{usuario1, usuario2, usuario3, usuario4, usuario5};
        String[] lastName = new String[]{"Garcia", "Lopez","hernandez","Romero","marquez"};

        //System.out.println(lastName);

        for(String name : names) {

            //System.out.println("los nombres son :" + name);

            allNames += name + " ";

            System.out.println(allNames);

        }







    }
}



