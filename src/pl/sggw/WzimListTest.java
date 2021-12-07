package pl.sggw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class WzimListTest {
    @Test
    public void shouldWork1()
    {
        List<String> lista = new WzimList<String>();
        boolean result = lista.isEmpty();
        String result_str = String.valueOf(result);
        Assertions.assertEquals("true",result_str);
    }

    @Test
    public void shouldWork2()
    {
        List<String> lista = new WzimList<String>();
        lista.add("Ala");
        String result = lista.get(0);
        Assertions.assertEquals("Ala",result);
    }

    @Test
    public void shouldWork3()
    {
        List<String> lista = new WzimList<String>();
        lista.add("Ala");

        boolean result1 = lista.contains("Ala");
        boolean result2 = lista.contains("Test");
        String result_str1 = String.valueOf(result1);
        String result_str2 = String.valueOf(result2);

        Assertions.assertEquals("true",result_str1);
        Assertions.assertEquals("false",result_str2);
    }
}