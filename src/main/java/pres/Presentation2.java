package pres;

import doa.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            String metierClassname = scanner.nextLine();
            Class Cmetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) Cmetier.getConstructor(IDao.class).newInstance(dao);

            Method method = Cmetier.getMethod("setDao", IDao.class);

            method.invoke(metier, dao);

            System.out.println("Resultat = " + metier.calcul());
            System.out.println(metier.calcul());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
