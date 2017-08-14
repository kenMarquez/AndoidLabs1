package mx.androidlabs.solid.LiskovSubstitution;

/**
 * Created by Dagorik on 13/08/17.
 */

public class LiskovSubstitution {


    public static String getColor(Animal animal) {
        return animal.color;
    }


    public static void main(String[] args) {

//        Perro perro = new Perro();
//        perro.color = "Rojo";
//        String color = getColor(perro);
//        System.out.println(color);

        Ave ave = new Ave();
        ave.color = "Cafe";
        String color = getColor(ave);
        System.out.println(color);

    }


}
