package metier;
import doa.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier{

    @Autowired
    @Qualifier("dao")
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(){

    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23 / Math.cos(t*Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
