package Pres;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotations {
    public static void main(String []args){
        ApplicationContext context= new AnnotationConfigApplicationContext("Dao","Metier","ext");

        Imetier metier=context.getBean(Imetier.class);
        System.out.println(metier.calcul());

    }
}
