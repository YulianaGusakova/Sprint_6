import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUP() {
        cat = new Cat(feline);
    }
@Test
    public void getSoundTest() {
        assertEquals("Неверный звук кошки","Мяу", cat.getSound());
}
@Test
public void getFoodTest() throws Exception {
       Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       assertEquals("Неверно подобран рацион для кошки", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
   }
}
