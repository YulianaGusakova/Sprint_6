import com.example.Feline;
import com.example.LionAlex;
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
public class LionAlexTest {
@Mock
Feline feline;

private LionAlex lionAlex;

    @Before
    public void setUP() throws Exception {
        lionAlex = new LionAlex(feline);
    }
    @Test
    public void getFriendsTest() {
        assertEquals("Неверный список друзей Алекса", List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), lionAlex.getFriends());
    }

    @Test
public void getPlaceOfLivingTest() {
        assertEquals("Алекс живет в другом месте","Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        assertEquals("У Алекса нет львят", 0, lionAlex.getKittens());
    }

    @Test
    public void haveManeTest() {
assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Неверно подобран рацион для льва Алекса", List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }
}
