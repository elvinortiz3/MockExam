import static org.junit.Assert.*;
import org.junit.Test;
public class QuadraticPolynomialTester {
    @Test
    public void settersGettersTest () {
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
        p.setA(p.getA()+1.0);
        p.setB(p.getB()*3.0);
        p.setC(p.getC()/3.0);
        assertEquals("Wrong quadratic coefficient", 2.0, p.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 6.0, p.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 1.0, p.getC(), 1e-10);
    }
    @Test
    public void constructorTest1 () {
        QuadraticPolynomial p1 = new QuadraticPolynomial(1.0, 2.0, 3.0);
        assertEquals("Wrong quadratic coefficient", 1.0, p1.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 2.0, p1.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 3.0, p1.getC(), 1e-10);
    }
}
