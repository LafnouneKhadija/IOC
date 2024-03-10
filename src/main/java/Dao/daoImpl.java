package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class daoImpl implements Idao{
    @Override
    public double getData() {

        //se connecter à la BD pour recuperer la temperature
        System.out.println("Version base de donnes ");
        double temp=Math.random()*40;
return temp;
    }
}
