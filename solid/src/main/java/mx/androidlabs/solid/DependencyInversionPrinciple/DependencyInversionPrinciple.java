package mx.androidlabs.solid.DependencyInversionPrinciple;

import mx.androidlabs.solid.OpenClosedPrinciple.Moto;

/**
 * Created by Dagorik on 13/08/17.
 */

public class DependencyInversionPrinciple {


    public static void main(String[] args) {

//        Lampara lampara = new Lampara();
//        lampara.encender(new Boton());

        Motor motor = new Motor();
        motor.arrancar(new Boton());

        IBoton boton = new Boton();
        IBoton iboton = new IBoton() {
            @Override
            public void on() {

            }

            @Override
            public void off() {

            }
        };

    }
}
