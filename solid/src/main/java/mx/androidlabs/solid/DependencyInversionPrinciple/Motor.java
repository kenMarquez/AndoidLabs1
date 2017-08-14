package mx.androidlabs.solid.DependencyInversionPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Motor implements Imotor {
    @Override
    public void arrancar(IBoton iboton) {
        iboton.on();
        System.out.println("Arranca el motor");
    }
}
