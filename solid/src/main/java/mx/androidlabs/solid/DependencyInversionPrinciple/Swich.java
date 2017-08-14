package mx.androidlabs.solid.DependencyInversionPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Swich implements IBoton {
    @Override
    public void on() {
        System.out.println("Se movio el siwch");
    }

    @Override
    public void off() {

    }
}
