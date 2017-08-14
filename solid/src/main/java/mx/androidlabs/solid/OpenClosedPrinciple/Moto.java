package mx.androidlabs.solid.OpenClosedPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Moto implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("Arranca moto");
    }
}
