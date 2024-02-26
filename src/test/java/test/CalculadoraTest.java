
package test;

import com.danielsanchez.calculadorajava.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class CalculadoraTest {
    
    @Test
    public void testSuma() {
        double valorEsperado = 10;
        double valorActual = Calculadora.calcular(7, 3, '+');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testResta() {
        double valorEsperado = 4;
        double valorActual = Calculadora.calcular(7, 3, '-');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMultiplicacion() {
        double valorEsperado = 21;
        double valorActual = Calculadora.calcular(7, 3, '*');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testDivision() {
        double valorEsperado = 2.5;
        double valorActual = Calculadora.calcular(10, 4, '/');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testPotencia() {
        double valorEsperado = 8;
        double valorActual = Calculadora.calcular(2, 3, '^');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testModulo() {
        double valorEsperado = 1;
        double valorActual = Calculadora.calcular(10, 3, '%');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testRaiz() {
        double valorEsperado = 9.0;
        double valorActual = Calculadora.calcular(81, 2, 'r');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testOperacionInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.calcular(5, 3, 'x');
        });
    }
}
