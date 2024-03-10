package Pres;

import Metier.metierImpl;
import ext.daoImpl2;

public class pres {
    public static void main (String[] args){

        // Injection des dependances par instanciation statique => New
        daoImpl2 dao=new daoImpl2();
        metierImpl metier=new metierImpl(dao);
       // metier.setDao(dao);
        System.out.println("resultat="+metier.calcul());
    }
}
