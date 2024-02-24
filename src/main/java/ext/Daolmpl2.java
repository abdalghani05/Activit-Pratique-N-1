package ext;

import doa.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class Daolmpl2 implements IDao {

        @Override
        public double getData() {
            System.out.println("Version Capteurs");
            double temp= 1000;
            return temp;
        }
}
