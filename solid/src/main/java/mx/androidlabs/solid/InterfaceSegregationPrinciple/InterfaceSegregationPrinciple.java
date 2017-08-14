package mx.androidlabs.solid.InterfaceSegregationPrinciple;

import android.util.Log;

/**
 * Created by Dagorik on 13/08/17.
 */

public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {

//        Avestruz avestruz = new Avestruz();
//        avestruz.correr();

        Loro loro = new Loro();
        loro.volar();
        loro.comer();





    }

    static class Avestruz implements IPajaroSimple, ICorredor{

        @Override
        public void correr() {
            System.out.println("La avestruz correeeee!!");
        }

        @Override
        public void comer() {
            System.out.println("La avestruz come!!");

        }
    }

    class Pinguino implements IPajaroSimple, INadador{

        @Override
        public void nadar() {

        }

        @Override
        public void comer() {

        }


    }
    static class Loro implements IPajaroSimple, IVolador{

        @Override
        public void volar() {
            System.out.println("El looro vuela");
        }

        @Override
        public void comer() {
            System.out.println("El loro come");


        }
    }
}
