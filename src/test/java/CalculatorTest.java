import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 15;

        int actualResult = Calculadora.suma(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testResta() {
        int num1 = 15;
        int num2 = 5;
        int expectedResult = 10;

        int actualResult = Calculadora.resta(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicacion() {
        int num1 = 5;
        int num2 = 4;
        int expectedResult = 20;

        int actualResult = Calculadora.multiplicacion(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivision() {
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 5;

        int actualResult = Calculadora.division(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        int num1 = 10;
        int num2 = 0;

        Calculadora.division(num1, num2);
    }
}
