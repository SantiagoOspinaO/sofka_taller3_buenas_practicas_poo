import java.util.Scanner;

public class UIMenu {

    public static void showMenu(){

        System.out.println("¡BIENVENIDOS!");
        System.out.println("Selecciona tu genero preferido!");


        int response = 0;
        do {

            for (int i = 0; i < Song.GENRE.length; i++) {
                System.out.println(i+1 + ". " + Song.GENRE[i]);
            }
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response){

                case 1:
                    System.out.println(" ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");

            }

        } while (response != 0);

    }
}
