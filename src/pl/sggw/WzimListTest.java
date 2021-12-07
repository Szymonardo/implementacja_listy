package pl.sggw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

        Assertions.assertEquals(true, lista.contains("Ala"));
        Assertions.assertEquals(false, lista.contains("Test"));
    }

    @Test
    public void shouldWork4()
    {
        List<String> lista = new WzimList<String>();
        lista.add("Bartek");
        lista.add("Tomek");
        lista.add("Ola");
        lista.add("Rafał");

        Assertions.assertEquals(true, lista.remove("Tomek"));
        Assertions.assertEquals(false, lista.remove("Bożena"));
    }

    @Test
    public void shouldWork5()
    {
        List<String> lista = new WzimList<String>();
        lista.add("Bartek");
        lista.add("Tomek");
        lista.add("Ala");
        lista.add("Rafał");

        Assertions.assertEquals("Ala",  lista.set(2,"Monika"));
    }
}