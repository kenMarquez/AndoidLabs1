package mx.androidlabs.solid.OpenClosedPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Car implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("Arranca carro");
    }
}
