package br.com.fiap.test;

import br.com.fiap.model.Calculadora;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    public void testSum(){
        Integer result = calc.sum(5,10);
        assertEquals(5, result,10);
    }
    @Test
    public void testSubtraction(){
        Integer result = calc.subtraction(5,2);
        assertEquals(3, result);
    }
    @Test
    public void testMultiply(){
        Integer result = calc.multiply(7,1);
        assertEquals(7, result);
    }
    @Test
    public void testDivisionFive(){
        Double result = calc.division(8,2);
        assertEquals(4, result);
    }
}