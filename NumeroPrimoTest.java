
package com.mycompany.ejertestparam;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

/**
 *
 * @author Vic
 */
public class NumeroPrimoTest 
{
     @Parameters
    public static List<Object> datos()
    {
        return Arrays.asList(new Object[][]{{10},{7},{3},{1},{8},{10},{20}});
    }
    
    @Parameter(0)
    public int val1;
    
    NumeroPrimo Obj= new NumeroPrimo();
    
    @Test
    public void NumeroPrimoTest() 
    {
       boolean Esperado1=true;
       boolean Esperado2=false;
        boolean Prueba=Obj.validate(val1);
        if(!Prueba)
            assertEquals(Esperado2,Prueba);
        else
            assertEquals(Esperado1,Prueba);
    }
}