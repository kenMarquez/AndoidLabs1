package mx.androidlabs.solid.DependencyInversionPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Boton implements IBoton{


    @Override
    public void on() {
        System.out.println("Se preciona el boton encender");
    }

    @Override
    public void off() {

    }
}
