package Metier;

import Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class metierImpl implements Imetier{
   //prete à fonctionner n'importe quel classe qui implemente l'interface idao

    //@Autowired
    //@Qualifier("dao")
   private Idao dao; //couplage faible

public metierImpl(Idao dao){
    this.dao = dao;
}
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }


    //pour permettre d'injecter dans la variable dao
    //un objet d'une classe qui implemente l'interface Idao
    //@parm dao


    public void setDao(Idao dao){
        this.dao = dao;
    }
}
