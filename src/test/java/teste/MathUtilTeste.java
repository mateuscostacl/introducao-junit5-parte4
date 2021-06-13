
package teste;

import aplicativo.MathUtil;
import static aplicativo.MathUtil.mdc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


class MathUtilTest {
 

    @Test
    void testSomeMethodAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    void testMdcApositivoP3(){
       final int a = 15;
       final int b = 0;
       final int esperado = 15;
       final int obtido = MathUtil.mdc(a, b);
       assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAnegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        // mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(18, 6) == 2 * mdc(9, 3)
        //      6       == 2 * 3
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        // se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a*b, c);
        final int obtido = mdc(b,c);
        System.out.println("Esperado: " + esperado + "Obtido: " + obtido);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){
        // se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
       
        final int obtido = mdc(b,c);
        System.out.println("Esperado: " + esperado + "Obtido: " + obtido);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;
        // mdc(a,b) == mdc(b,a)
        final int esperado = mdc(a,b);
        final int obtido = mdc(b,a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a,b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcGeralIndivisiveis(){
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = mdc(a,b);
        assertEquals(esperado, obtido);    
    }
    
    @Test
    void testMdcMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test void testMdcNenhumParametro(){}
        assertThrows(IllegalArgumentException.class, () -> mdc());
    
    @Test
    void testMdcNulo(){
        assertThrows(NullPointerException.class, () -> mdc(null));
    }
    
                
    
}