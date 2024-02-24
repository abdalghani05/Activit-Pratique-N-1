package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul ;
    @Test
    public void testSomme() {
        calcul = new Calcul();
        double a = 5;
        double b = 11;
        double expected = 16;
        double res = calcul.Somme(a, b);
        Assert.assertTrue(res == expected);
    }
}
