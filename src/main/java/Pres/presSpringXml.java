package Pres;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXml {
    public static void main(String []args){
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Imetier metier=(Imetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
