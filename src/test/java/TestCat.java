import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCat {

    @Test
    public void testGetSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assert cat.getSound().equals("Мяу");;
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> foodLost = new ArrayList();
        foodLost.addAll(Arrays.asList("Животные", "Птицы", "Рыба"));

        assert cat.getFood().equals(foodLost);
    }


}
