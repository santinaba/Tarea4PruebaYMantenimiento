package com.mycompany.ejertestparam;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class TrianguloTest {

    Triangulo triangulo = new Triangulo();

    @Test
    @junitparams.Parameters({"5,5,5, Equilatero", "7,7,3, Isoceles", "1,2,3, Escaleno"})
    public void testTipoTriangulo(int a, int b, int c, String tipo) {
        assertEquals(triangulo.tipoTriangulo(a, b, c), tipo);
    }
}
