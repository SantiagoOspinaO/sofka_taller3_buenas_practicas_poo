import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Object> songsParcial = new ArrayList<>();


        Object variable1 = new Song("Hola, we");
        Object variable2 = new Song("Hola");
        Object variable3 = new Song("awdawdawd");
        Object variable4 = new Song("awdawdaw");
        Object variable5 = new Song("awdawdawdawd");

        songsParcial.add(variable1);
        songsParcial.add(variable2);
        songsParcial.add(variable3);
        songsParcial.add(variable4);
        songsParcial.add(variable5);

        System.out.println(songsParcial);




    }
}
