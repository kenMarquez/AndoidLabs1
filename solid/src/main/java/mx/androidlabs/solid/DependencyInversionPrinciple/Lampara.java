package mx.androidlabs.solid.DependencyInversionPrinciple;

/**
 * Created by Dagorik on 13/08/17.
 */

public class Lampara implements ILampara {



    @Override
    public void encender(IBoton iboton) {
        iboton.on();
        System.out.println("Se enciendo la lampara!");
    }

    @Override
    public void apagar() {

    }





}
