package Pres;

import Dao.Idao;
import Metier.Imetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class pres2  {
    public static void main(String[] args) throws Exception{

            Scanner scanner=new Scanner(new File("config.txt"));
            String daoClassName=scanner.nextLine();
            Class cDao=Class.forName(daoClassName);
            Idao dao=(Idao) cDao.newInstance();
           // System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        Imetier metier=(Imetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",Idao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);
        System.out.println("Resultat=>"+metier.calcul());
    }
}
