package com.mycompany.ejertestparam;

import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    @junitparams.Parameters({"4,7,11", "6,-1,5", "-8,5,-3", "9,0,9"})
    public void testSuma(int a, int b, int c) {
        assertThat(calculadora.suma(a, b), Matchers.is(c));
    }

    @Test
    @junitparams.Parameters({"4,7,-3", "6,-1,7", "-8,5,-13", "9,0,9"})
    public void testResta(int a, int b, int c) {
        assertEquals(calculadora.resta(a, b), c);
    }

    @Test
    @junitparams.Parameters({"4,7,28", "6,-1,-6", "-8,5,-40", "9,0,0"})
    public void testMultiplicacion(int a, int b, int c) {
        assertThat(calculadora.multiplicacion(a, b), Matchers.equalTo(c));
    }

    @Test
    @junitparams.Parameters({"4,2,2", "6,-1,-6", "-11,4,-2", "9,-1,-9"})
    public void testDivision(int a, int b, int c) {
        assertThat(calculadora.division(a, b), Matchers.is(c));
    }
}
