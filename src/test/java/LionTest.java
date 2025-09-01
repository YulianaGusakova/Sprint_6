import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    private Lion lion;

    @Before
    public void setUP() throws Exception {
        lion = new Lion ("Самец", feline);
    }
 @Test
 public void haveManeTest() throws Exception {
             assertTrue(lion.doesHaveMane());
 }

 @Test
 public void haveManeThrowsExceptionTest() {
        try {
            Lion lion = new Lion("Мужской", feline);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
 }

@Test
    public void getKittensTest() {
    Mockito.when(feline.getKittens()).thenReturn(4);
    assertEquals("Неверное количество львят", 4, lion.getKittens());
}

@Test
    public void getFoodTest() throws Exception {
       Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    assertEquals("Неверно подобран рацион для льва", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
}
}
