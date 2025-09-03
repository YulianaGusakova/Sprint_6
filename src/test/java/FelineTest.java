import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();  // создание объекта один раз
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> foodList = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Неверно определено семейство","Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoArgumentTest() {
        assertEquals("Неверное количество котят",1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgumentTest() {
        assertEquals("Неверное количество котят", 4, feline.getKittens(4));
    }
}
